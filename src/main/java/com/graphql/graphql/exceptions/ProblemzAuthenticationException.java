package com.graphql.graphql.exceptions;

public class ProblemzAuthenticationException extends  RuntimeException{


    public ProblemzAuthenticationException(){
        super("Invalid Credentials");
    }

}
