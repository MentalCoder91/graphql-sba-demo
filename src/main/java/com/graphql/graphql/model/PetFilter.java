package com.graphql.graphql.model;

public class PetFilter {
  private String petType;

  public PetFilter() {
  }

  public PetFilter(String petType) {
    this.petType = petType;
  }

  public String getPetType() {
    return petType;
  }

  public void setPetType(String petType) {
    this.petType = petType;
  }

  @Override
  public String toString() {
    return "PetFilter{" + "petType='" + petType + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetFilter that = (PetFilter) o;
        return java.util.Objects.equals(petType, that.petType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(petType);
  }

  public static PetFilter.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String petType;

    public PetFilter build() {
      PetFilter result = new PetFilter();
          result.petType = this.petType;
          return result;
    }

    public PetFilter.Builder petType(String petType) {
      this.petType = petType;
      return this;
    }
  }
}
