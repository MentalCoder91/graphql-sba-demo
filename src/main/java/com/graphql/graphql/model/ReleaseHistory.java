package com.graphql.graphql.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReleaseHistory {

    private Integer year;
    private Boolean printedEdition;
    private String releasedCountry;
}


