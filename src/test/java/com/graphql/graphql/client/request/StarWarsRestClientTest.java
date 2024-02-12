package com.graphql.graphql.client.request;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StarWarsRestClientTest {



    @Autowired
    private StarWarsRestClient client;



    @Test
    void testJson(){
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
        var result = client.asJson(body,null);
        assertNotNull(result);
        System.out.println(result);


    }

    @Test
    void testOneStarshipFixed() throws Exception {
        var result = client.getOneStarShip();
        System.out.println("Result getOneStarShip"+result.toString());
        assertNotNull(result);
        assertNotNull(result.getModel());
        assertNotNull(result.getName());
        assertNotNull(result.getManufacturers());
    }

    @Test
    void testOneFilm_Right() throws Exception {
        var result = client.oneFilm("1");
        assertNotNull(result);
        assertNotNull(result.getTitle());
    }

    @Test
    void testOneFilm_Invalid() throws Exception {
        var errors = client.oneFilmInValid();
        assertNotNull(errors);
        assertFalse(errors.isEmpty());
    }

}