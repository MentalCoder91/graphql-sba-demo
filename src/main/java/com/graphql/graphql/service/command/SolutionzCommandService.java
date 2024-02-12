package com.graphql.graphql.service.command;

import com.graphql.graphql.datasource.problemz.entity.Solutionz;
import com.graphql.graphql.datasource.problemz.repository.SolutionzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class SolutionzCommandService
{

    @Autowired
    private SolutionzRepository solutionzRepository;


    public Solutionz createSolutionz(Solutionz s){
        return solutionzRepository.save(s);
    }

    public Optional<Solutionz> voteBad(UUID solutionId){
         solutionzRepository.addVoteBadCount(solutionId);
         var updated = solutionzRepository.findById(solutionId);
         return updated;
    }

    public Optional<Solutionz> voteGood(UUID solutionId){
        solutionzRepository.addVoteGoodCount(solutionId);
        var updated = solutionzRepository.findById(solutionId);
        return updated;
    }




}
