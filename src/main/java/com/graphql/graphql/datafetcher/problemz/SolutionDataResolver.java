package com.graphql.graphql.datafetcher.problemz;

import com.graphql.graphql.datasource.problemz.entity.Problemz;
import com.graphql.graphql.datasource.problemz.entity.Solutionz;
import com.graphql.graphql.datasource.problemz.entity.Userz;
import com.graphql.graphql.exceptions.ProblemzAuthenticationException;
import com.graphql.graphql.model.problemiz.Solution;
import com.graphql.graphql.model.problemiz.SolutionCreateInput;
import com.graphql.graphql.model.problemiz.SolutionResponse;
import com.graphql.graphql.model.problemiz.SolutionVoteInput;
import com.graphql.graphql.service.command.SolutionzCommandService;
import com.graphql.graphql.service.query.ProblemzQueryService;
import com.graphql.graphql.service.query.SolutionzQueryService;
import com.graphql.graphql.service.query.UserzQueryService;
import com.graphql.graphql.util.GraphqlBeanMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import reactor.core.publisher.Flux;

import java.util.Optional;
import java.util.UUID;

@DgsComponent
public class SolutionDataResolver {


    @Autowired
    private UserzQueryService userzQueryService;
    @Autowired
    private ProblemzQueryService problemzQueryService;

    @Autowired
    private SolutionzCommandService solutionzCommandService;

    @DgsData(parentType = "Mutation",
            field = "solutionCreate")
    public SolutionResponse createSolution(
            @RequestHeader(name = "authToken", required = true) String authToken,
            @InputArgument(name = "solution") SolutionCreateInput solutionCreateInput
    ) {

        var userByAuthToken = userzQueryService.findUserByAuthToken(authToken)
                .orElseThrow(ProblemzAuthenticationException::new);

        var problemzId = UUID.fromString(solutionCreateInput.getProblemId());
        var problemz = problemzQueryService.getProblemById(problemzId.toString())
                .orElseThrow(DgsEntityNotFoundException::new);

        Solutionz solutionz = GraphqlBeanMapper.mapToEntity(solutionCreateInput, userByAuthToken, problemz);
        var created = solutionzCommandService.createSolutionz(solutionz);

        return SolutionResponse.newBuilder().solution(GraphqlBeanMapper.mapToGraphql(created)).build();
    }

    @DgsData(parentType = "Mutation",
            field = "solutionVote")
    public SolutionResponse createSolutionVote(
            @RequestHeader(name = "authToken", required = true) String authToken,
            @InputArgument(name = "solutionId") String solutionId,
            @InputArgument(name = "vote") SolutionVoteInput solutionVoteInput
    ) {
        Optional<Solutionz> updated;
        var userByAuthToken = userzQueryService.findUserByAuthToken(authToken)
                .orElseThrow(ProblemzAuthenticationException::new);

        if(null == solutionVoteInput){
            throw new IllegalArgumentException("SolutionVoteInput should not be null");
        }

        if(solutionVoteInput.getVoteAsGood()){
            updated = solutionzCommandService.voteGood(UUID.fromString(solutionVoteInput.getSolutionId()));

        }else{
            updated = solutionzCommandService.voteBad(UUID.fromString(solutionVoteInput.getSolutionId()));
        }

        if(updated.isEmpty()){
            throw new DgsEntityNotFoundException("Solution "+solutionVoteInput.getSolutionId() +" not found");
        }

        return SolutionResponse.newBuilder().solution(GraphqlBeanMapper.mapToGraphql(updated.get())).build();


    }

    @DgsData(parentType = "Subscription",
            field = "solutionVoteChanged")
    public Flux<Solution> subscribeSolutionVote(@InputArgument(name = "solutionId") String solutionId) {
        return null;
    }


}
