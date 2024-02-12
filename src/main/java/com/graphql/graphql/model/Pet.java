package com.graphql.graphql.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Dog.class, name = "Dog"),
    @JsonSubTypes.Type(value = Cat.class, name = "Cat")
})
public interface Pet {
  /**
   * Pet's name, make it <strong>cute</strong>
   */
  String getName();

  /**
   * Pet's name, make it <strong>cute</strong>
   */
  void setName(String name);

  PetFoodType getFood();

  void setFood(PetFoodType food);

  String getBreed();

  void setBreed(String breed);
}
