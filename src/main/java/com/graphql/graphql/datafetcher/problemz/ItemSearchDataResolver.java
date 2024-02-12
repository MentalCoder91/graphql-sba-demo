package com.graphql.graphql.datafetcher.problemz;

import com.graphql.graphql.datasource.problemz.entity.Solutionz;
import com.graphql.graphql.datasource.problemz.repository.SolutionzRepository;
import com.graphql.graphql.model.problemiz.Problem;
import com.graphql.graphql.model.problemiz.SearchItemFilter;
import com.graphql.graphql.model.problemiz.SearchableItem;
import com.graphql.graphql.model.problemiz.Solution;
import com.graphql.graphql.service.query.ProblemzQueryService;
import com.graphql.graphql.service.query.SolutionzQueryService;
import com.graphql.graphql.util.GraphqlBeanMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ItemSearchDataResolver {


    @Autowired
    SolutionzQueryService solutionzQueryService;


    @Autowired
    ProblemzQueryService problemzQueryService;

    @DgsData(parentType = "Query",field = "itemSearch")
    public List<SearchableItem> itemSearch(@InputArgument(name = "filter") SearchItemFilter searchItemFilter){

        var result = new ArrayList<SearchableItem>();
        var keyword = searchItemFilter.getKeyword();


        List<Solution> solutions = solutionzQueryService.findByKeyword(keyword).stream().map(GraphqlBeanMapper::mapToGraphql).collect(Collectors.toList());

        List<Problem> problems = problemzQueryService.problemzByKeyword(keyword).stream().map(GraphqlBeanMapper::mapToGraphql).collect(Collectors.toList());

        result.addAll(solutions);
        result.addAll(problems);

        if(result.isEmpty()){
            throw new DgsEntityNotFoundException("No item with keyword:"+ keyword);
        }

        result.sort(Comparator.comparing(SearchableItem::getCreateDateTime).reversed());

        return result;
    }


}
