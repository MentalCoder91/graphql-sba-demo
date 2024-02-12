package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An individual person or character within the Star Wars universe.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Person implements Node {
  /**
   *
   * The birth year of the person, using the in-universe standard of BBY or ABY -
   * Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is
   * a battle that occurs at the end of Star Wars episode IV: A New Hope.
   */
  private String birthYear;

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  private String created;

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  private String edited;

  /**
   *
   * The eye color of this person. Will be "unknown" if not known or "n/a" if the
   * person does not have an eye.
   */
  private String eyeColor;

  private PersonFilmsConnection filmConnection;

  /**
   *
   * The gender of this person. Either "Male", "Female" or "unknown",
   * "n/a" if the person does not have a gender.
   */
  private String gender;

  /**
   *
   * The hair color of this person. Will be "unknown" if not known or "n/a" if the
   * person does not have hair.
   */
  private String hairColor;

  /**
   * The height of the person in centimeters.
   */
  private Integer height;

  /**
   * A planet that this person was born on or inhabits.
   */
  private Planet homeworld;

  /**
   * The ID of an object
   */
  private String id;

  /**
   * The mass of the person in kilograms.
   */
  private Double mass;

  /**
   * The name of this person.
   */
  private String name;

  /**
   * The skin color of this person.
   */
  private String skinColor;

  /**
   * The species that this person belongs to, or null if unknown.
   */
  private Species species;

  private PersonStarshipsConnection starshipConnection;

  private PersonVehiclesConnection vehicleConnection;

  public Person() {
  }

  public Person(String birthYear, String created, String edited, String eyeColor,
      PersonFilmsConnection filmConnection, String gender, String hairColor, Integer height,
      Planet homeworld, String id, Double mass, String name, String skinColor, Species species,
      PersonStarshipsConnection starshipConnection, PersonVehiclesConnection vehicleConnection) {
    this.birthYear = birthYear;
    this.created = created;
    this.edited = edited;
    this.eyeColor = eyeColor;
    this.filmConnection = filmConnection;
    this.gender = gender;
    this.hairColor = hairColor;
    this.height = height;
    this.homeworld = homeworld;
    this.id = id;
    this.mass = mass;
    this.name = name;
    this.skinColor = skinColor;
    this.species = species;
    this.starshipConnection = starshipConnection;
    this.vehicleConnection = vehicleConnection;
  }

  /**
   *
   * The birth year of the person, using the in-universe standard of BBY or ABY -
   * Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is
   * a battle that occurs at the end of Star Wars episode IV: A New Hope.
   */
  public String getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  public String getEdited() {
    return edited;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  /**
   *
   * The eye color of this person. Will be "unknown" if not known or "n/a" if the
   * person does not have an eye.
   */
  public String getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public PersonFilmsConnection getFilmConnection() {
    return filmConnection;
  }

  public void setFilmConnection(PersonFilmsConnection filmConnection) {
    this.filmConnection = filmConnection;
  }

  /**
   *
   * The gender of this person. Either "Male", "Female" or "unknown",
   * "n/a" if the person does not have a gender.
   */
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   *
   * The hair color of this person. Will be "unknown" if not known or "n/a" if the
   * person does not have hair.
   */
  public String getHairColor() {
    return hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  /**
   * The height of the person in centimeters.
   */
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * A planet that this person was born on or inhabits.
   */
  public Planet getHomeworld() {
    return homeworld;
  }

  public void setHomeworld(Planet homeworld) {
    this.homeworld = homeworld;
  }

  /**
   * The ID of an object
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The mass of the person in kilograms.
   */
  public Double getMass() {
    return mass;
  }

  public void setMass(Double mass) {
    this.mass = mass;
  }

  /**
   * The name of this person.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The skin color of this person.
   */
  public String getSkinColor() {
    return skinColor;
  }

  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  /**
   * The species that this person belongs to, or null if unknown.
   */
  public Species getSpecies() {
    return species;
  }

  public void setSpecies(Species species) {
    this.species = species;
  }

  public PersonStarshipsConnection getStarshipConnection() {
    return starshipConnection;
  }

  public void setStarshipConnection(PersonStarshipsConnection starshipConnection) {
    this.starshipConnection = starshipConnection;
  }

  public PersonVehiclesConnection getVehicleConnection() {
    return vehicleConnection;
  }

  public void setVehicleConnection(PersonVehiclesConnection vehicleConnection) {
    this.vehicleConnection = vehicleConnection;
  }

  @Override
  public String toString() {
    return "Person{" + "birthYear='" + birthYear + "'," +"created='" + created + "'," +"edited='" + edited + "'," +"eyeColor='" + eyeColor + "'," +"filmConnection='" + filmConnection + "'," +"gender='" + gender + "'," +"hairColor='" + hairColor + "'," +"height='" + height + "'," +"homeworld='" + homeworld + "'," +"id='" + id + "'," +"mass='" + mass + "'," +"name='" + name + "'," +"skinColor='" + skinColor + "'," +"species='" + species + "'," +"starshipConnection='" + starshipConnection + "'," +"vehicleConnection='" + vehicleConnection + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return java.util.Objects.equals(birthYear, that.birthYear) &&
                            java.util.Objects.equals(created, that.created) &&
                            java.util.Objects.equals(edited, that.edited) &&
                            java.util.Objects.equals(eyeColor, that.eyeColor) &&
                            java.util.Objects.equals(filmConnection, that.filmConnection) &&
                            java.util.Objects.equals(gender, that.gender) &&
                            java.util.Objects.equals(hairColor, that.hairColor) &&
                            java.util.Objects.equals(height, that.height) &&
                            java.util.Objects.equals(homeworld, that.homeworld) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(mass, that.mass) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(skinColor, that.skinColor) &&
                            java.util.Objects.equals(species, that.species) &&
                            java.util.Objects.equals(starshipConnection, that.starshipConnection) &&
                            java.util.Objects.equals(vehicleConnection, that.vehicleConnection);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(birthYear, created, edited, eyeColor, filmConnection, gender, hairColor, height, homeworld, id, mass, name, skinColor, species, starshipConnection, vehicleConnection);
  }

  public static Person.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     *
     * The birth year of the person, using the in-universe standard of BBY or ABY -
     * Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is
     * a battle that occurs at the end of Star Wars episode IV: A New Hope.
     */
    private String birthYear;

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    /**
     *
     * The eye color of this person. Will be "unknown" if not known or "n/a" if the
     * person does not have an eye.
     */
    private String eyeColor;

    private PersonFilmsConnection filmConnection;

    /**
     *
     * The gender of this person. Either "Male", "Female" or "unknown",
     * "n/a" if the person does not have a gender.
     */
    private String gender;

    /**
     *
     * The hair color of this person. Will be "unknown" if not known or "n/a" if the
     * person does not have hair.
     */
    private String hairColor;

    /**
     * The height of the person in centimeters.
     */
    private Integer height;

    /**
     * A planet that this person was born on or inhabits.
     */
    private Planet homeworld;

    /**
     * The ID of an object
     */
    private String id;

    /**
     * The mass of the person in kilograms.
     */
    private Double mass;

    /**
     * The name of this person.
     */
    private String name;

    /**
     * The skin color of this person.
     */
    private String skinColor;

    /**
     * The species that this person belongs to, or null if unknown.
     */
    private Species species;

    private PersonStarshipsConnection starshipConnection;

    private PersonVehiclesConnection vehicleConnection;

    public Person build() {
                  Person result = new Person();
                      result.birthYear = this.birthYear;
          result.created = this.created;
          result.edited = this.edited;
          result.eyeColor = this.eyeColor;
          result.filmConnection = this.filmConnection;
          result.gender = this.gender;
          result.hairColor = this.hairColor;
          result.height = this.height;
          result.homeworld = this.homeworld;
          result.id = this.id;
          result.mass = this.mass;
          result.name = this.name;
          result.skinColor = this.skinColor;
          result.species = this.species;
          result.starshipConnection = this.starshipConnection;
          result.vehicleConnection = this.vehicleConnection;
                      return result;
    }

    /**
     *
     * The birth year of the person, using the in-universe standard of BBY or ABY -
     * Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is
     * a battle that occurs at the end of Star Wars episode IV: A New Hope.
     */
    public Person.Builder birthYear(String birthYear) {
      this.birthYear = birthYear;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    public Person.Builder created(String created) {
      this.created = created;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    public Person.Builder edited(String edited) {
      this.edited = edited;
      return this;
    }

    /**
     *
     * The eye color of this person. Will be "unknown" if not known or "n/a" if the
     * person does not have an eye.
     */
    public Person.Builder eyeColor(String eyeColor) {
      this.eyeColor = eyeColor;
      return this;
    }

    public Person.Builder filmConnection(
        PersonFilmsConnection filmConnection) {
      this.filmConnection = filmConnection;
      return this;
    }

    /**
     *
     * The gender of this person. Either "Male", "Female" or "unknown",
     * "n/a" if the person does not have a gender.
     */
    public Person.Builder gender(String gender) {
      this.gender = gender;
      return this;
    }

    /**
     *
     * The hair color of this person. Will be "unknown" if not known or "n/a" if the
     * person does not have hair.
     */
    public Person.Builder hairColor(String hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    /**
     * The height of the person in centimeters.
     */
    public Person.Builder height(Integer height) {
      this.height = height;
      return this;
    }

    /**
     * A planet that this person was born on or inhabits.
     */
    public Person.Builder homeworld(Planet homeworld) {
      this.homeworld = homeworld;
      return this;
    }

    /**
     * The ID of an object
     */
    public Person.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The mass of the person in kilograms.
     */
    public Person.Builder mass(Double mass) {
      this.mass = mass;
      return this;
    }

    /**
     * The name of this person.
     */
    public Person.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The skin color of this person.
     */
    public Person.Builder skinColor(String skinColor) {
      this.skinColor = skinColor;
      return this;
    }

    /**
     * The species that this person belongs to, or null if unknown.
     */
    public Person.Builder species(Species species) {
      this.species = species;
      return this;
    }

    public Person.Builder starshipConnection(
        PersonStarshipsConnection starshipConnection) {
      this.starshipConnection = starshipConnection;
      return this;
    }

    public Person.Builder vehicleConnection(
        PersonVehiclesConnection vehicleConnection) {
      this.vehicleConnection = vehicleConnection;
      return this;
    }
  }
}
