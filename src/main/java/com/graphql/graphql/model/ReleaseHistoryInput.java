package com.graphql.graphql.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReleaseHistoryInput {

    private Integer year;
    private Boolean printedEdition;
}

