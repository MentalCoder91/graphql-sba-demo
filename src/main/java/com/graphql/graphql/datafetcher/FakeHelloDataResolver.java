package com.graphql.graphql.datafetcher;

import com.graphql.graphql.datasource.fake.FakeHelloDataSource;
import com.graphql.graphql.model.Hello;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;
import java.util.stream.IntStream;

@DgsComponent
public class FakeHelloDataResolver {

    @DgsQuery
    public List<Hello> allHellos(){

        return FakeHelloDataSource.HELLO_LIST;
    }

    @DgsQuery
    public Hello oneHello(){
        return FakeHelloDataSource.HELLO_LIST.get(0);
    }

}
