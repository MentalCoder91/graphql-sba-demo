package com.graphql.graphql.service.query;

import com.graphql.graphql.datasource.problemz.entity.Userz;
import com.graphql.graphql.datasource.problemz.repository.UserzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserzQueryService {



    @Autowired
    private UserzRepository userzRepository;


    public Optional<Userz> findUserByAuthToken(String authToken){
        return userzRepository.findUserByToken(authToken);
    }
}
