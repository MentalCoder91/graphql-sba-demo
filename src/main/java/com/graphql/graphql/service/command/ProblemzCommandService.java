package com.graphql.graphql.service.command;

import com.graphql.graphql.datasource.problemz.repository.ProblemzRepository;
import com.graphql.graphql.model.problemiz.ProblemCreateInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.graphql.graphql.datasource.problemz.entity.Problemz;
@Service
public class ProblemzCommandService {

    @Autowired
    ProblemzRepository problemzRepository;

    public Problemz createProblem(Problemz problem){
        var created = problemzRepository.save(problem);

        return created;
    }
}
