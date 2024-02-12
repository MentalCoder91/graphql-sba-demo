package com.graphql.graphql.service.query;


import com.graphql.graphql.datasource.problemz.entity.Problemz;
import com.graphql.graphql.datasource.problemz.repository.ProblemzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProblemzQueryService {

    @Autowired
    ProblemzRepository problemzRepository;


    public List<Problemz> getProblems(){
        return problemzRepository.findAllByOrderByCreationTimestampDesc();

    }


    public Optional<Problemz> getProblemById(String uuid){

        Optional<Problemz> problemzById = problemzRepository.findById(UUID.fromString(uuid));
        if(problemzById.isEmpty()){
            throw new RuntimeException();
        }

        return  problemzById;

    }

    public List<Problemz> problemzByKeyword(String keyword){

        return problemzRepository.findByKeyword(keyword);
    }


}
