package com.graphql.graphql.datafetcher;


import com.graphql.graphql.datasource.fake.FakeBookDataSource;
import com.graphql.graphql.model.Book;
import com.graphql.graphql.model.ReleaseHistoryInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@DgsComponent
public class BookByReleasedDataResolver {

//    @DgsData(parentType = "Query",field = "booksByReleased")
//    public List<Book> booksByReleasedHistoryInput(@InputArgument(name = "releasedInput") ReleaseHistoryInput releaseHistoryInput){
//
//        if(Objects.isNull(releaseHistoryInput)){
//            return FakeBookDataSource.BOOK_LIST;
//        }
//
//
//
//     return FakeBookDataSource.BOOK_LIST.stream()
//                .filter(x->{
//                    return StringUtils.equalsAnyIgnoreCase(authorName,x.getAuthor().getName());
//                }).collect(Collectors.toList());
//
//    }


}
