package com.graphql.graphql.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileApp {

    private String name;
    private String version;
    private List<String> platform;
    private Author author;
    private String appId;
    private LocalDate releaseDate;
    private Integer downloaded;
    private URL homepage;
    private MobileAppCategory category;



}


