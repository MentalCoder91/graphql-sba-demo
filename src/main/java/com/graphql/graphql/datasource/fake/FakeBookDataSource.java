package com.graphql.graphql.datasource.fake;

import com.graphql.graphql.model.Author;
import com.graphql.graphql.model.Book;
import com.graphql.graphql.model.Address;
import com.graphql.graphql.model.ReleaseHistory;
import jakarta.annotation.PostConstruct;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
@Configuration
public class FakeBookDataSource {

    @Autowired
    Faker faker;

    public static  List<Book> BOOK_LIST = new ArrayList<>();


    @PostConstruct
    private void postConstruct() {
        for (int i = 0; i < 20; i++) {
            var addresses = new ArrayList<Address>();
            var author = Author.builder().addresses(addresses)
                    .name(faker.book().author())
                    .originCountry(faker.country().name())
                    .build();
            System.out.println(author);
            var released = ReleaseHistory.builder()
                    .printedEdition(faker.bool().bool())
                    .releasedCountry(faker.country().name())
                    .year(faker.number().numberBetween(2019, 2021))
                    .build();
            System.out.println(released);
            var book = Book.builder().author(author)
                    .publisher(faker.book().publisher())
                    .title(faker.book().title())
                    .released(released)
                    .build();

            for (int j = 0; j < ThreadLocalRandom.current().nextInt(1, 3); j++) {
                var address = Address.builder()
                        .country(faker.address().country())
                        .city(faker.address().cityName())
                        .country(faker.address().country())
                        .street(faker.address().streetAddress())
                        .zipCode(faker.address().zipCode())
                        .build();

                addresses.add(address);
            }

            BOOK_LIST.add(book);
        }
    }

    public static List<Book> getBookList() {
        return BOOK_LIST;
    }
}
