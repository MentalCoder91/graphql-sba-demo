package com.graphql.graphql.util;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {


    @Bean
    RestClient getRestClient(){

        return RestClient.builder().build();
    }


    @Bean
    RestTemplate getRestTemplate(){

        return new RestTemplate();
    }


}
