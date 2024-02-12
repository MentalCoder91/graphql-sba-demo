package com.graphql.graphql.datafetcher.problemz;


import com.graphql.graphql.datasource.problemz.entity.Userz;
import com.graphql.graphql.model.problemiz.*;
import com.graphql.graphql.service.command.UserzCommandService;
import com.graphql.graphql.service.query.UserzQueryService;
import com.graphql.graphql.util.GraphqlBeanMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Optional;

@DgsComponent
public class UserDataResolver {


    @Autowired
    UserzCommandService userzCommandService;

    @Autowired
    UserzQueryService userzQueryService;

    @DgsData(parentType = "Query",field = "me")
    public User me(@RequestHeader(name = "authToken",required = true) String authToken){
        return GraphqlBeanMapper.mapToGraphql(userzQueryService.findUserByAuthToken(authToken).get());
    }

    @DgsData(parentType = "Mutation",field = "userCreate")
    public UserResponse userCreate(@InputArgument(name = "user") UserCreateInput userCreateInput){

        var userz = GraphqlBeanMapper.mapToEntity(userCreateInput);
        var saved = userzCommandService.createUser(userz);

        return UserResponse.newBuilder()
                .user(GraphqlBeanMapper.mapToGraphql(saved)).build();
    }

    @DgsData(parentType = "Mutation",field = "userLogin")
    public UserResponse userLogin(@InputArgument(name = "user") UserLoginInput userLoginInput){

        var generateUserzToken = userzCommandService.login(userLoginInput.getUsername(),userLoginInput.getPassword());
        var userAuthToken = GraphqlBeanMapper.mapToGraphql(generateUserzToken);
        var userInfo = me(userAuthToken.getAuthToken());
        return  UserResponse.newBuilder().authToken(userAuthToken)
                .user(userInfo).build();

    }

    @DgsData(parentType = "Mutation",field = "userActivation")
    public UserActivationResponse userActivation(@InputArgument(name = "user") UserActivationInput userLoginInput){

        if(userLoginInput == null){
            throw new DgsEntityNotFoundException("Please enter the user to activate");
        }

        var userz = userzCommandService.activateUser(userLoginInput.getUsername(), userLoginInput.getActive())
                .orElseThrow(DgsEntityNotFoundException::new);

        return  UserActivationResponse.newBuilder()
                .isActive(userz.isActive()).build();


    }



}
