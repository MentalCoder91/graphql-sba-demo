package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 * A type of person or character within the Star Wars Universe.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Species implements Node {
  /**
   * The average height of this species in centimeters.
   */
  private Double averageHeight;

  /**
   * The average lifespan of this species in years, null if unknown.
   */
  private Integer averageLifespan;

  /**
   * The classification of this species, such as "mammal" or "reptile".
   */
  private String classification;

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  private String created;

  /**
   * The designation of this species, such as "sentient".
   */
  private String designation;

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  private String edited;

  /**
   *
   * Common eye colors for this species, null if this species does not typically
   * have eyes.
   */
  private List<String> eyeColors;

  private SpeciesFilmsConnection filmConnection;

  /**
   *
   * Common hair colors for this species, null if this species does not typically
   * have hair.
   */
  private List<String> hairColors;

  /**
   * A planet that this species originates from.
   */
  private Planet homeworld;

  /**
   * The ID of an object
   */
  private String id;

  /**
   * The language commonly spoken by this species.
   */
  private String language;

  /**
   * The name of this species.
   */
  private String name;

  private SpeciesPeopleConnection personConnection;

  /**
   *
   * Common skin colors for this species, null if this species does not typically
   * have skin.
   */
  private List<String> skinColors;

  public Species() {
  }

  public Species(Double averageHeight, Integer averageLifespan, String classification,
      String created, String designation, String edited, List<String> eyeColors,
      SpeciesFilmsConnection filmConnection, List<String> hairColors, Planet homeworld, String id,
      String language, String name, SpeciesPeopleConnection personConnection,
      List<String> skinColors) {
    this.averageHeight = averageHeight;
    this.averageLifespan = averageLifespan;
    this.classification = classification;
    this.created = created;
    this.designation = designation;
    this.edited = edited;
    this.eyeColors = eyeColors;
    this.filmConnection = filmConnection;
    this.hairColors = hairColors;
    this.homeworld = homeworld;
    this.id = id;
    this.language = language;
    this.name = name;
    this.personConnection = personConnection;
    this.skinColors = skinColors;
  }

  /**
   * The average height of this species in centimeters.
   */
  public Double getAverageHeight() {
    return averageHeight;
  }

  public void setAverageHeight(Double averageHeight) {
    this.averageHeight = averageHeight;
  }

  /**
   * The average lifespan of this species in years, null if unknown.
   */
  public Integer getAverageLifespan() {
    return averageLifespan;
  }

  public void setAverageLifespan(Integer averageLifespan) {
    this.averageLifespan = averageLifespan;
  }

  /**
   * The classification of this species, such as "mammal" or "reptile".
   */
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
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
   * The designation of this species, such as "sentient".
   */
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
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
   * Common eye colors for this species, null if this species does not typically
   * have eyes.
   */
  public List<String> getEyeColors() {
    return eyeColors;
  }

  public void setEyeColors(List<String> eyeColors) {
    this.eyeColors = eyeColors;
  }

  public SpeciesFilmsConnection getFilmConnection() {
    return filmConnection;
  }

  public void setFilmConnection(SpeciesFilmsConnection filmConnection) {
    this.filmConnection = filmConnection;
  }

  /**
   *
   * Common hair colors for this species, null if this species does not typically
   * have hair.
   */
  public List<String> getHairColors() {
    return hairColors;
  }

  public void setHairColors(List<String> hairColors) {
    this.hairColors = hairColors;
  }

  /**
   * A planet that this species originates from.
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
   * The language commonly spoken by this species.
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The name of this species.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpeciesPeopleConnection getPersonConnection() {
    return personConnection;
  }

  public void setPersonConnection(SpeciesPeopleConnection personConnection) {
    this.personConnection = personConnection;
  }

  /**
   *
   * Common skin colors for this species, null if this species does not typically
   * have skin.
   */
  public List<String> getSkinColors() {
    return skinColors;
  }

  public void setSkinColors(List<String> skinColors) {
    this.skinColors = skinColors;
  }

  @Override
  public String toString() {
    return "Species{" + "averageHeight='" + averageHeight + "'," +"averageLifespan='" + averageLifespan + "'," +"classification='" + classification + "'," +"created='" + created + "'," +"designation='" + designation + "'," +"edited='" + edited + "'," +"eyeColors='" + eyeColors + "'," +"filmConnection='" + filmConnection + "'," +"hairColors='" + hairColors + "'," +"homeworld='" + homeworld + "'," +"id='" + id + "'," +"language='" + language + "'," +"name='" + name + "'," +"personConnection='" + personConnection + "'," +"skinColors='" + skinColors + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Species that = (Species) o;
        return java.util.Objects.equals(averageHeight, that.averageHeight) &&
                            java.util.Objects.equals(averageLifespan, that.averageLifespan) &&
                            java.util.Objects.equals(classification, that.classification) &&
                            java.util.Objects.equals(created, that.created) &&
                            java.util.Objects.equals(designation, that.designation) &&
                            java.util.Objects.equals(edited, that.edited) &&
                            java.util.Objects.equals(eyeColors, that.eyeColors) &&
                            java.util.Objects.equals(filmConnection, that.filmConnection) &&
                            java.util.Objects.equals(hairColors, that.hairColors) &&
                            java.util.Objects.equals(homeworld, that.homeworld) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(language, that.language) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(personConnection, that.personConnection) &&
                            java.util.Objects.equals(skinColors, that.skinColors);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(averageHeight, averageLifespan, classification, created, designation, edited, eyeColors, filmConnection, hairColors, homeworld, id, language, name, personConnection, skinColors);
  }

  public static Species.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The average height of this species in centimeters.
     */
    private Double averageHeight;

    /**
     * The average lifespan of this species in years, null if unknown.
     */
    private Integer averageLifespan;

    /**
     * The classification of this species, such as "mammal" or "reptile".
     */
    private String classification;

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * The designation of this species, such as "sentient".
     */
    private String designation;

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    /**
     *
     * Common eye colors for this species, null if this species does not typically
     * have eyes.
     */
    private List<String> eyeColors;

    private SpeciesFilmsConnection filmConnection;

    /**
     *
     * Common hair colors for this species, null if this species does not typically
     * have hair.
     */
    private List<String> hairColors;

    /**
     * A planet that this species originates from.
     */
    private Planet homeworld;

    /**
     * The ID of an object
     */
    private String id;

    /**
     * The language commonly spoken by this species.
     */
    private String language;

    /**
     * The name of this species.
     */
    private String name;

    private SpeciesPeopleConnection personConnection;

    /**
     *
     * Common skin colors for this species, null if this species does not typically
     * have skin.
     */
    private List<String> skinColors;

    public Species build() {
                  Species result = new Species();
                      result.averageHeight = this.averageHeight;
          result.averageLifespan = this.averageLifespan;
          result.classification = this.classification;
          result.created = this.created;
          result.designation = this.designation;
          result.edited = this.edited;
          result.eyeColors = this.eyeColors;
          result.filmConnection = this.filmConnection;
          result.hairColors = this.hairColors;
          result.homeworld = this.homeworld;
          result.id = this.id;
          result.language = this.language;
          result.name = this.name;
          result.personConnection = this.personConnection;
          result.skinColors = this.skinColors;
                      return result;
    }

    /**
     * The average height of this species in centimeters.
     */
    public Species.Builder averageHeight(Double averageHeight) {
      this.averageHeight = averageHeight;
      return this;
    }

    /**
     * The average lifespan of this species in years, null if unknown.
     */
    public Species.Builder averageLifespan(
        Integer averageLifespan) {
      this.averageLifespan = averageLifespan;
      return this;
    }

    /**
     * The classification of this species, such as "mammal" or "reptile".
     */
    public Species.Builder classification(
        String classification) {
      this.classification = classification;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    public Species.Builder created(String created) {
      this.created = created;
      return this;
    }

    /**
     * The designation of this species, such as "sentient".
     */
    public Species.Builder designation(String designation) {
      this.designation = designation;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    public Species.Builder edited(String edited) {
      this.edited = edited;
      return this;
    }

    /**
     *
     * Common eye colors for this species, null if this species does not typically
     * have eyes.
     */
    public Species.Builder eyeColors(List<String> eyeColors) {
      this.eyeColors = eyeColors;
      return this;
    }

    public Species.Builder filmConnection(
        SpeciesFilmsConnection filmConnection) {
      this.filmConnection = filmConnection;
      return this;
    }

    /**
     *
     * Common hair colors for this species, null if this species does not typically
     * have hair.
     */
    public Species.Builder hairColors(List<String> hairColors) {
      this.hairColors = hairColors;
      return this;
    }

    /**
     * A planet that this species originates from.
     */
    public Species.Builder homeworld(Planet homeworld) {
      this.homeworld = homeworld;
      return this;
    }

    /**
     * The ID of an object
     */
    public Species.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The language commonly spoken by this species.
     */
    public Species.Builder language(String language) {
      this.language = language;
      return this;
    }

    /**
     * The name of this species.
     */
    public Species.Builder name(String name) {
      this.name = name;
      return this;
    }

    public Species.Builder personConnection(
        SpeciesPeopleConnection personConnection) {
      this.personConnection = personConnection;
      return this;
    }

    /**
     *
     * Common skin colors for this species, null if this species does not typically
     * have skin.
     */
    public Species.Builder skinColors(List<String> skinColors) {
      this.skinColors = skinColors;
      return this;
    }
  }
}
