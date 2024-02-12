package com.graphql.graphql.datafetcher.problemz;

import com.graphql.graphql.datasource.problemz.entity.Problemz;
import com.graphql.graphql.datasource.problemz.entity.Userz;
import com.graphql.graphql.exceptions.ProblemzAuthenticationException;
import com.graphql.graphql.model.problemiz.Problem;
import com.graphql.graphql.model.problemiz.ProblemCreateInput;
import com.graphql.graphql.model.problemiz.ProblemResponse;
import com.graphql.graphql.service.command.ProblemzCommandService;
import com.graphql.graphql.service.query.ProblemzQueryService;
import com.graphql.graphql.service.query.UserzQueryService;
import com.graphql.graphql.util.GraphqlBeanMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@DgsComponent
public class ProblemDataResolver {


    @Autowired
    ProblemzQueryService problemzQueryService;


    @Autowired
    ProblemzCommandService problemzCommandService;


    @Autowired
    UserzQueryService userzQueryService;

    @DgsData(parentType = "Query",field = "problemLatestList")
    public List<Problem> problemLatestList(){

        List<Problemz> problems = problemzQueryService.getProblems();

        return problems.stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = "Query",field = "problemDetail")
    public Problem problemDetail(@InputArgument(name="id") String problemId){
        var problemById = problemzQueryService.getProblemById(problemId).orElseThrow(DgsEntityNotFoundException::new);

        return  GraphqlBeanMapper.mapToGraphql(problemById) ;
    }

    @DgsData(parentType = "Mutation",field = "problemCreate")
    public ProblemResponse problemCreate(
            @RequestHeader(name="authToken",required = true) String authToken,
            @InputArgument(name="problem") ProblemCreateInput problemCreateInput){
        ProblemResponse response = new ProblemResponse();
        if(null == authToken){
            throw new ProblemzAuthenticationException();
        }

        if(null == problemCreateInput){
            throw new DgsEntityNotFoundException("Please enter problem Input to create problem");
        }

        Optional<Userz> userByAuthToken = userzQueryService.findUserByAuthToken(authToken);

        if(userByAuthToken.isEmpty()){
            throw new DgsEntityNotFoundException("User Not Found");
        }


        Problemz problem = problemzCommandService.createProblem(GraphqlBeanMapper.mapToEntity(problemCreateInput, userByAuthToken.get()));
        response.setProblem(GraphqlBeanMapper.mapToGraphql(problem));
        return response;

    }

    @DgsData(parentType = "Subscription",field = "problemAdded")
    public Flux<Problem> subscribeProblemAdded(){

        return null;
    }


}
