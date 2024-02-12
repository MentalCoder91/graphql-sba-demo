package com.graphql.graphql.client.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.graphql.client.response.FilmResponse;
import com.graphql.graphql.client.response.GraphqlErrorResponse;
import com.graphql.graphql.client.response.PlanetResponse;
import com.graphql.graphql.client.response.StarshipResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class StarWarsRestClient {


    private static String URL = "https://swapi-graphql.netlify.app/.netlify/functions/index";


    @Autowired
    private RestClient restClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper mapper;


    public String asJson(GraphqlRequest body, Map<String, List<String>> headers){


        var requestHeaders = new HttpHeaders();

        if(headers !=null){

            headers.forEach(requestHeaders::addAll);
        }

        var responseEntity = restTemplate.postForEntity(URL,
                new HttpEntity(body,requestHeaders),String.class);


        return responseEntity.getBody();
    }


    public List<PlanetResponse> getPlanetList() throws JsonProcessingException {



        var query = """ 
                  query allPlanets {
                  allPlanets {
                    planets {
                      name
                      climates
                      terrains
                    }
                  }
                }
                """;

         var body = new GraphqlRequest();
         body.setQuery(query);


        var json = asJson(body,null);


        var jsonNode = mapper.readTree(json);

        var data = jsonNode.at("/data/allPlanets/planets");
        
        return mapper.readValue(data.toString(), new TypeReference<List<PlanetResponse>>() {});

    }

    public StarshipResponse getOneStarShip() throws JsonProcessingException {



        var query = """ 
                  query oneStarshipFixed {
                    starship(id: "c3RhcnNoaXBzOjU=") {
                      model
                      name
                      manufacturers
                    }
                  }
                """;

        var body = new GraphqlRequest();
        body.setQuery(query);

        var json = asJson(body,null);


        var jsonNode = mapper.readTree(json);
        var data = jsonNode.at("/data/starship");

        return mapper.readValue(data.toString(), new TypeReference<StarshipResponse>() {});

    }

    public FilmResponse oneFilm(String filmId) throws JsonProcessingException {

        var query = """
                query oneFilm($filmId: ID!) {
                  film(filmID: $filmId) {
                    title
                    director
                    releaseDate
                  }
                }
                """;

        var body = new GraphqlRequest();
        body.setQuery(query);

        var variableMap = Map.of("filmId",(Object)filmId);
        body.setVariables(variableMap);

        var json = asJson(body,null);
        var jsonNode = mapper.readTree(json);
        var data = jsonNode.at("/data/film");

        return mapper.readValue(data.toString(), new TypeReference<FilmResponse>() {});

    }


    public List<GraphqlErrorResponse>  oneFilmInValid() throws JsonProcessingException {
        var query = """
                query oneFilm($filmId: ID!) {
                  film(filmID: $filmId) {
                    title
                    director
                    releaseDate
                  }
                }
                """;

        var body = new GraphqlRequest();
        body.setQuery(query);

        var variableMap = Map.of("filmId",(Object)"xxx");
        body.setVariables(variableMap);

        var json = asJson(body,null);
        var jsonNode = mapper.readTree(json);
        var errors = jsonNode.at("/errors");

        if(errors!=null){
            return mapper.readValue(errors.toString(), new TypeReference<List<GraphqlErrorResponse>>() {});
        }

        return null;

    }


}
