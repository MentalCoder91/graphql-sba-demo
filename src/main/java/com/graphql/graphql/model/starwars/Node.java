package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An object with an ID
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Film.class, name = "Film"),
    @JsonSubTypes.Type(value = Person.class, name = "Person"),
    @JsonSubTypes.Type(value = Planet.class, name = "Planet"),
    @JsonSubTypes.Type(value = Species.class, name = "Species"),
    @JsonSubTypes.Type(value = Starship.class, name = "Starship"),
    @JsonSubTypes.Type(value = Vehicle.class, name = "Vehicle")
})
public interface Node {
  /**
   * The id of the object.
   */
  String getId();

  /**
   * The id of the object.
   */
  void setId(String id);
}
