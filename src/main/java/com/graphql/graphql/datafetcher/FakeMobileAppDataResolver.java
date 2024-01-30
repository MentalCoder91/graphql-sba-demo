package com.graphql.graphql.datafetcher;


import com.graphql.graphql.datasource.fake.FakeBookDataSource;
import com.graphql.graphql.datasource.fake.FakeMobileAppDataSource;
import com.graphql.graphql.model.*;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import graphql.schema.DataFetchingEnvironment;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class FakeMobileAppDataResolver {

    @DgsData(parentType = "Query",field = "mobileApps")
    public List<MobileApp> mobileApps(@InputArgument(name = "mobileAppFilter")  Optional<MobileAppFilter> filter){


        if(filter.isEmpty())
                return FakeMobileAppDataSource.MOBILE_APP_LIST;


        return FakeMobileAppDataSource.MOBILE_APP_LIST.stream()
                .filter(mobile ->this.matchFilter(filter.get(),mobile)).collect(Collectors.toList());
    }

    private boolean matchFilter(MobileAppFilter mobileAppFilter, MobileApp mobileApp) {
        var isAppMatch = StringUtils.containsIgnoreCase(mobileApp.getName(),
                StringUtils.defaultIfBlank(mobileAppFilter.getName(), StringUtils.EMPTY))
                && StringUtils.containsIgnoreCase(mobileApp.getVersion(),
                StringUtils.defaultIfBlank(mobileAppFilter.getVersion(), StringUtils.EMPTY))
                && mobileApp.getReleaseDate().isAfter(
                Optional.ofNullable(mobileAppFilter.getReleasedAfter()).orElse(LocalDate.MIN))
                && mobileApp.getDownloaded() >=
                Optional.ofNullable(mobileAppFilter.getMinimumDownload()).orElse(0);

        if (!isAppMatch) {
            return false;
        }

        if (StringUtils.isNotBlank(mobileAppFilter.getPlatform())
                && !mobileApp.getPlatform().contains(mobileAppFilter.getPlatform().toLowerCase())) {
            return false;
        }

        if (mobileAppFilter.getAuthor() != null
                && !StringUtils.containsIgnoreCase(mobileApp.getAuthor().getName(),
                StringUtils.defaultIfBlank(mobileAppFilter.getAuthor().getName(), StringUtils.EMPTY))) {
            return false;
        }

        if(mobileAppFilter.getCategory()!=null
            && !mobileApp.getCategory().equals(mobileAppFilter.getCategory())
        ){
            return false;
        }

        return true;
    }


}
