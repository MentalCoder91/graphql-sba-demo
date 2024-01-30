package com.graphql.graphql.datasource.fake;


import com.graphql.graphql.model.Hello;
import jakarta.annotation.PostConstruct;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FakeHelloDataSource {


    @Autowired
    Faker faker;

    public static final List<Hello> HELLO_LIST = new ArrayList<>();


    @PostConstruct
    private void post()
    {
        for (int i = 0; i < 20; i++) {
            var hello = Hello.builder().text(faker.company().name())
                    .randomNumber(faker.random().nextInt())
                    .build();
            HELLO_LIST.add(hello);
        }

    }
}
