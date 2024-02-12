package com.graphql.graphql.datafetcher;

import com.graphql.graphql.datasource.fake.FakeStockDataSource;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import com.graphql.graphql.model.Stock;
import java.time.Duration;

@DgsComponent
public class FakeStockDataResolver {

    @Autowired
    private FakeStockDataSource dataSource;

//    @DgsSubscription
    @DgsData(parentType = "Subscription", field = "randomStock")
    public Publisher<Stock> randomStock() {
        return Flux.interval(Duration.ofSeconds(3)).map(t -> dataSource.randomStock());
    }

}
