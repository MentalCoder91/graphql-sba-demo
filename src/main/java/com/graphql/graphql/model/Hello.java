package com.graphql.graphql.model;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor@NoArgsConstructor
public class Hello implements SmartSearchResult {

    private String text;

    private Integer randomNumber;
}
