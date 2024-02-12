package com.graphql.graphql.model.problemiz;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.OffsetDateTime;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Problem.class, name = "Problem"),
    @JsonSubTypes.Type(value = Solution.class, name = "Solution")
})
public interface SearchableItem {
  String getId();

  void setId(String id);

  OffsetDateTime getCreateDateTime();

  void setCreateDateTime(OffsetDateTime createDateTime);

  String getPrettyCreateDateTime();

  void setPrettyCreateDateTime(String prettyCreateDateTime);

  String getContent();

  void setContent(String content);

  User getAuthor();

  void setAuthor(User author);
}
