package com.graphql.graphql.service.query;


import com.graphql.graphql.datasource.problemz.entity.Solutionz;
import com.graphql.graphql.datasource.problemz.repository.SolutionzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionzQueryService {
    @Autowired
    SolutionzRepository solutionzRepository;

    public List<Solutionz> findByKeyword(String keyword){
        return solutionzRepository.findBykeyword(keyword);
    }
}
