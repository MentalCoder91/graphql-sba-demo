package com.graphql.graphql;

import com.graphql.graphql.datasource.fake.FakeBookDataSource;
import com.graphql.graphql.datasource.fake.FakeMobileAppDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);

		FakeBookDataSource.getBookList().forEach(System.out::println);
		FakeMobileAppDataSource.MOBILE_APP_LIST.forEach(System.out::println);
	}

}
