package com.graphql.graphql.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileAppFilter {

    private String name;
    private String version;
    private String platform;
    private Author author;
    private LocalDate releasedAfter;
    private Integer minimumDownload;
    private MobileAppCategory category;

}


