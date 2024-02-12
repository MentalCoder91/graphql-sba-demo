package com.graphql.graphql.client.request;

import lombok.Data;

import java.util.Map;


@Data
public class GraphqlRequest {

    private String query;

    private Map<String,Object> variables;
}
