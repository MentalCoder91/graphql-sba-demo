package com.graphql.graphql.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Cat implements Pet {
  private String name;

  private PetFoodType food;

  private String breed;

  private String registry;

  public Cat() {
  }

  public Cat(String name, PetFoodType food, String breed, String registry) {
    this.name = name;
    this.food = food;
    this.breed = breed;
    this.registry = registry;
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

  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  @Override
  public String toString() {
    return "Cat{" + "name='" + name + "'," +"food='" + food + "'," +"breed='" + breed + "'," +"registry='" + registry + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat that = (Cat) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(food, that.food) &&
                            java.util.Objects.equals(breed, that.breed) &&
                            java.util.Objects.equals(registry, that.registry);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, food, breed, registry);
  }

  public static Cat.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private PetFoodType food;

    private String breed;

    private String registry;

    public Cat build() {
                  Cat result = new Cat();
                      result.name = this.name;
          result.food = this.food;
          result.breed = this.breed;
          result.registry = this.registry;
                      return result;
    }

    public Cat.Builder name(String name) {
      this.name = name;
      return this;
    }

    public Cat.Builder food(PetFoodType food) {
      this.food = food;
      return this;
    }

    public Cat.Builder breed(String breed) {
      this.breed = breed;
      return this;
    }

    public Cat.Builder registry(String registry) {
      this.registry = registry;
      return this;
    }
  }
}
