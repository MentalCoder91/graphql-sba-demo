package com.graphql.graphql.service.command;

import com.graphql.graphql.datasource.problemz.entity.Userz;
import com.graphql.graphql.datasource.problemz.entity.UserzToken;
import com.graphql.graphql.datasource.problemz.repository.UserzRepository;
import com.graphql.graphql.datasource.problemz.repository.UserzTokenRepository;
import com.graphql.graphql.exceptions.ProblemzAuthenticationException;
import com.graphql.graphql.util.HashUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserzCommandService {

    @Autowired
    private UserzRepository userzRepository;

    @Autowired
    private UserzTokenRepository userzTokenRepository;


    public UserzToken login(String username,String password){

       var usernameExists =  userzRepository.findByUsernameIgnoreCase(username);
       if(usernameExists.isEmpty() || !HashUtil.isBcryptMatch(usernameExists.get().getHashedPassword(),password)){
           throw new ProblemzAuthenticationException();
       }

       var randomAuthToken = RandomStringUtils.randomAlphabetic(40);
       return refreshToken(usernameExists.get().getId(),randomAuthToken);

    }

    private UserzToken refreshToken(UUID userId,String authToken){
        var userzToken  = new UserzToken();

        userzToken.setUserId(userId);
        userzToken.setAuthToken(authToken);

        var now = LocalDateTime.now();
        userzToken.setCreationTimestamp(now);
        userzToken.setExpiryTimestamp(now.plusHours(2));

        return userzTokenRepository.save(userzToken);

    }


    public Userz createUser(Userz userz){

        return userzRepository.save(userz);
    }

    public Optional<Userz> activateUser(String username, boolean isActive){
        userzRepository.activateUser(username,isActive);
        return  userzRepository.findByUsernameIgnoreCase(username);
    }



}
