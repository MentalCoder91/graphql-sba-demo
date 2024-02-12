package com.graphql.graphql.datafetcher;

import com.graphql.graphql.datasource.fake.FakeBookDataSource;
import com.graphql.graphql.datasource.fake.FakeHelloDataSource;
import com.graphql.graphql.model.SmartSearchResult;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@DgsComponent
public class FakeSmartSearchDataResolver {

    @DgsData(parentType = "Query", field = "smartSearch")
    public List<SmartSearchResult> getSmartSearch(@InputArgument(name = "keyword") Optional<String> keyword) {
        var smartSearchList = new ArrayList<SmartSearchResult>();

        if (keyword.isEmpty()) {
            smartSearchList.addAll(FakeHelloDataSource.HELLO_LIST);
            smartSearchList.addAll(FakeBookDataSource.BOOK_LIST);
        } else {
            var keywordString = keyword.get();

            FakeHelloDataSource.HELLO_LIST.stream().filter(
                    h -> StringUtils.containsIgnoreCase(h.getText(), keywordString)
            ).forEach(smartSearchList::add);

            FakeBookDataSource.BOOK_LIST.stream().filter(
                    b -> StringUtils.containsIgnoreCase(b.getTitle(), keywordString)
            ).forEach(smartSearchList::add);
        }

        return smartSearchList;
    }

}
