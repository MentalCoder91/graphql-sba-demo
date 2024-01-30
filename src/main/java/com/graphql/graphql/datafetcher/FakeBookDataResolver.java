package com.graphql.graphql.datafetcher;


import com.graphql.graphql.datasource.fake.FakeBookDataSource;
import com.graphql.graphql.model.Book;
import com.graphql.graphql.model.ReleaseHistory;
import com.graphql.graphql.model.ReleaseHistoryInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import graphql.schema.DataFetchingEnvironment;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@DgsComponent
public class FakeBookDataResolver {

    @DgsData(parentType = "Query",field = "books")
    public List<Book> booksWritten(@InputArgument(name = "author") String authorName){

        if(StringUtils.isBlank(authorName)){
            return FakeBookDataSource.BOOK_LIST;
        }



     return FakeBookDataSource.BOOK_LIST.stream()
                .filter(x->{
                    return StringUtils.equalsAnyIgnoreCase(authorName,x.getAuthor().getName());
                }).collect(Collectors.toList());

    }

    @DgsData(parentType = "Query",field = "booksByReleased")
    public List<Book> booksByReleasedHistoryInput(DataFetchingEnvironment dataFetchingEnvironment){

        var releasedMap = (Map<String,Object>)dataFetchingEnvironment.getArgument("releasedInput");

        var releasedInput = ReleaseHistoryInput.builder()
                        .printedEdition((boolean)releasedMap.get("printedEdition"))
                                    .year((int)releasedMap.get("year")).build();



        return FakeBookDataSource.BOOK_LIST.stream()
                .filter(x->{
                    return this.matchReleaseHistory(releasedInput,x.getReleased());
                }).collect(Collectors.toList());

    }

    private boolean matchReleaseHistory(ReleaseHistoryInput input, ReleaseHistory element){


            return input.getPrintedEdition().equals(element.getPrintedEdition())
                            && input.getYear().equals(element.getYear());
    }


}
