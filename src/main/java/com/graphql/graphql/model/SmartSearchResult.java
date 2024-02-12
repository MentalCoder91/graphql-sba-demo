package com.graphql.graphql.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Hello.class, name = "Hello"),
    @JsonSubTypes.Type(value = Book.class, name = "Book")
})
public interface SmartSearchResult {
}
