//package com.graphql.graphql.client;
//
//import com.netflix.graphql.dgs.client.DefaultGraphQLClient;
//import com.netflix.graphql.dgs.client.GraphQLClient;
//import com.netflix.graphql.dgs.client.GraphQLResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class StarwarsGraphqlClient {
//
//    @Autowired
//    RestTemplate template;
//
//    private static String URL = "https://swapi-graphql.netlify.app/.netlify/functions/index";
//
//    private static String query = """
//            query allPlanets {
//              allPlanets {
//                planets {
//                  name
//                  climates
//                  terrains
//                }
//              }
//            }
//            query oneStarshipFixed {
//              starship(id: "c3RhcnNoaXBzOjU=") {
//                model
//                name
//                manufacturers
//              }
//            }
//            query oneFilm($filmId: ID!) {
//              film(filmID: $filmId) {
//                title
//                director
//                releaseDate
//              }
//            }
//
//            """;
//
//    private GraphQLClient graphQLClient = new DefaultGraphQLClient(URL);
//
//    private GraphQLResponse getGraphQLResponse(String operationName,Map<String,Object> variablesMap,
//                                               Map<String,? extends Object> headersMap){
//
//        if(variablesMap == null){
//            variablesMap = new HashMap<>();
//        }
//
//        return graphQLClient.executeQuery(query,variablesMap,operationName,
//                (url,headers,body)->{
//
//                    var requestHeaders = new HttpHeaders();
//                    headers.forEach(requestHeaders::put);
//
//                    if(headersMap !=null){
//                        headersMap.forEach(requestHeaders::addAll);
//                    }
//
//                var responseEntity = template.postForEntity()
//
//                });
//
//    }
//
//}
