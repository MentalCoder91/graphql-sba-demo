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
public class Author {

    private String name;
    private String originCountry;
    private List<Address> addresses;
}


