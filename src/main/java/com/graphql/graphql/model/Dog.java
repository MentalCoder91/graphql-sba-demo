package com.graphql.graphql.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Dog implements pet
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Dog implements Pet {
  private String name;

  private PetFoodType food;

  private String breed;

  private String size;

  private String coatLength;

  public Dog() {
  }

  public Dog(String name, PetFoodType food, String breed, String size, String coatLength) {
    this.name = name;
    this.food = food;
    this.breed = breed;
    this.size = size;
    this.coatLength = coatLength;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PetFoodType getFood() {
    return food;
  }

  public void setFood(PetFoodType food) {
    this.food = food;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getCoatLength() {
    return coatLength;
  }

  public void setCoatLength(String coatLength) {
    this.coatLength = coatLength;
  }

  @Override
  public String toString() {
    return "Dog{" + "name='" + name + "'," +"food='" + food + "'," +"breed='" + breed + "'," +"size='" + size + "'," +"coatLength='" + coatLength + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog that = (Dog) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(food, that.food) &&
                            java.util.Objects.equals(breed, that.breed) &&
                            java.util.Objects.equals(size, that.size) &&
                            java.util.Objects.equals(coatLength, that.coatLength);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, food, breed, size, coatLength);
  }

  public static Dog.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private PetFoodType food;

    private String breed;

    private String size;

    private String coatLength;

    public Dog build() {
                  Dog result = new Dog();
                      result.name = this.name;
          result.food = this.food;
          result.breed = this.breed;
          result.size = this.size;
          result.coatLength = this.coatLength;
                      return result;
    }

    public Dog.Builder name(String name) {
      this.name = name;
      return this;
    }

    public Dog.Builder food(PetFoodType food) {
      this.food = food;
      return this;
    }

    public Dog.Builder breed(String breed) {
      this.breed = breed;
      return this;
    }

    public Dog.Builder size(String size) {
      this.size = size;
      return this;
    }

    public Dog.Builder coatLength(String coatLength) {
      this.coatLength = coatLength;
      return this;
    }
  }
}
