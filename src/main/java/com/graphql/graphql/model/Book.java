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
public class Book {

    private String title;
    private String publisher;
    private Author author;
    private ReleaseHistory released;
}



