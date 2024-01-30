package com.graphql.graphql;

import com.netflix.graphql.dgs.DgsQueryExecutor;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FakeHelloDataResolverTest {


    @Autowired
    DgsQueryExecutor dgsQueryExecutor;


    @Test

    void testOneHello(){

        var graphQlQuery = """
                {
                    oneHello{
                        text
                        randomNumber
                    }
                }
                
                """;

            String text = dgsQueryExecutor.executeAndExtractJsonPath(graphQlQuery,"data.oneHello.text");

            Integer randomNumber = dgsQueryExecutor.executeAndExtractJsonPath(graphQlQuery,"data.oneHello.randomNumber");


            assertFalse(StringUtils.isBlank(text));
            assertNotNull(randomNumber);
    }

    @Test
    void testallHello(){

        var graphQlQuery = """
                {
                    allHellos{
                        text
                        randomNumber
                    }
                }
                
                """;

        List<String> text = dgsQueryExecutor.executeAndExtractJsonPath(graphQlQuery,"data.allHellos[*].text");

        List<Integer> randomNumber = dgsQueryExecutor.executeAndExtractJsonPath(graphQlQuery,"data.allHellos[*].randomNumber");


        assertNotNull(text);
        assertNotNull(randomNumber);
        assertFalse(text.isEmpty());
    }
}


