package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 *
 * A large mass, planet or planetoid in the Star Wars Universe, at the time of
 * 0 ABY.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Planet implements Node {
  /**
   * The climates of this planet.
   */
  private List<String> climates;

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  private String created;

  /**
   * The diameter of this planet in kilometers.
   */
  private Integer diameter;

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  private String edited;

  private PlanetFilmsConnection filmConnection;

  /**
   *
   * A number denoting the gravity of this planet, where "1" is normal or 1 standard
   * G. "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
   */
  private String gravity;

  /**
   * The ID of an object
   */
  private String id;

  /**
   * The name of this planet.
   */
  private String name;

  /**
   *
   * The number of standard days it takes for this planet to complete a single orbit
   * of its local star.
   */
  private Integer orbitalPeriod;

  /**
   * The average population of sentient beings inhabiting this planet.
   */
  private Double population;

  private PlanetResidentsConnection residentConnection;

  /**
   *
   * The number of standard hours it takes for this planet to complete a single
   * rotation on its axis.
   */
  private Integer rotationPeriod;

  /**
   *
   * The percentage of the planet surface that is naturally occuring water or bodies
   * of water.
   */
  private Double surfaceWater;

  /**
   * The terrains of this planet.
   */
  private List<String> terrains;

  public Planet() {
  }

  public Planet(List<String> climates, String created, Integer diameter, String edited,
      PlanetFilmsConnection filmConnection, String gravity, String id, String name,
      Integer orbitalPeriod, Double population, PlanetResidentsConnection residentConnection,
      Integer rotationPeriod, Double surfaceWater, List<String> terrains) {
    this.climates = climates;
    this.created = created;
    this.diameter = diameter;
    this.edited = edited;
    this.filmConnection = filmConnection;
    this.gravity = gravity;
    this.id = id;
    this.name = name;
    this.orbitalPeriod = orbitalPeriod;
    this.population = population;
    this.residentConnection = residentConnection;
    this.rotationPeriod = rotationPeriod;
    this.surfaceWater = surfaceWater;
    this.terrains = terrains;
  }

  /**
   * The climates of this planet.
   */
  public List<String> getClimates() {
    return climates;
  }

  public void setClimates(List<String> climates) {
    this.climates = climates;
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
   * The diameter of this planet in kilometers.
   */
  public Integer getDiameter() {
    return diameter;
  }

  public void setDiameter(Integer diameter) {
    this.diameter = diameter;
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

  public PlanetFilmsConnection getFilmConnection() {
    return filmConnection;
  }

  public void setFilmConnection(PlanetFilmsConnection filmConnection) {
    this.filmConnection = filmConnection;
  }

  /**
   *
   * A number denoting the gravity of this planet, where "1" is normal or 1 standard
   * G. "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
   */
  public String getGravity() {
    return gravity;
  }

  public void setGravity(String gravity) {
    this.gravity = gravity;
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
   * The name of this planet.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * The number of standard days it takes for this planet to complete a single orbit
   * of its local star.
   */
  public Integer getOrbitalPeriod() {
    return orbitalPeriod;
  }

  public void setOrbitalPeriod(Integer orbitalPeriod) {
    this.orbitalPeriod = orbitalPeriod;
  }

  /**
   * The average population of sentient beings inhabiting this planet.
   */
  public Double getPopulation() {
    return population;
  }

  public void setPopulation(Double population) {
    this.population = population;
  }

  public PlanetResidentsConnection getResidentConnection() {
    return residentConnection;
  }

  public void setResidentConnection(PlanetResidentsConnection residentConnection) {
    this.residentConnection = residentConnection;
  }

  /**
   *
   * The number of standard hours it takes for this planet to complete a single
   * rotation on its axis.
   */
  public Integer getRotationPeriod() {
    return rotationPeriod;
  }

  public void setRotationPeriod(Integer rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
  }

  /**
   *
   * The percentage of the planet surface that is naturally occuring water or bodies
   * of water.
   */
  public Double getSurfaceWater() {
    return surfaceWater;
  }

  public void setSurfaceWater(Double surfaceWater) {
    this.surfaceWater = surfaceWater;
  }

  /**
   * The terrains of this planet.
   */
  public List<String> getTerrains() {
    return terrains;
  }

  public void setTerrains(List<String> terrains) {
    this.terrains = terrains;
  }

  @Override
  public String toString() {
    return "Planet{" + "climates='" + climates + "'," +"created='" + created + "'," +"diameter='" + diameter + "'," +"edited='" + edited + "'," +"filmConnection='" + filmConnection + "'," +"gravity='" + gravity + "'," +"id='" + id + "'," +"name='" + name + "'," +"orbitalPeriod='" + orbitalPeriod + "'," +"population='" + population + "'," +"residentConnection='" + residentConnection + "'," +"rotationPeriod='" + rotationPeriod + "'," +"surfaceWater='" + surfaceWater + "'," +"terrains='" + terrains + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet that = (Planet) o;
        return java.util.Objects.equals(climates, that.climates) &&
                            java.util.Objects.equals(created, that.created) &&
                            java.util.Objects.equals(diameter, that.diameter) &&
                            java.util.Objects.equals(edited, that.edited) &&
                            java.util.Objects.equals(filmConnection, that.filmConnection) &&
                            java.util.Objects.equals(gravity, that.gravity) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(orbitalPeriod, that.orbitalPeriod) &&
                            java.util.Objects.equals(population, that.population) &&
                            java.util.Objects.equals(residentConnection, that.residentConnection) &&
                            java.util.Objects.equals(rotationPeriod, that.rotationPeriod) &&
                            java.util.Objects.equals(surfaceWater, that.surfaceWater) &&
                            java.util.Objects.equals(terrains, that.terrains);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(climates, created, diameter, edited, filmConnection, gravity, id, name, orbitalPeriod, population, residentConnection, rotationPeriod, surfaceWater, terrains);
  }

  public static Planet.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The climates of this planet.
     */
    private List<String> climates;

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * The diameter of this planet in kilometers.
     */
    private Integer diameter;

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    private PlanetFilmsConnection filmConnection;

    /**
     *
     * A number denoting the gravity of this planet, where "1" is normal or 1 standard
     * G. "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
     */
    private String gravity;

    /**
     * The ID of an object
     */
    private String id;

    /**
     * The name of this planet.
     */
    private String name;

    /**
     *
     * The number of standard days it takes for this planet to complete a single orbit
     * of its local star.
     */
    private Integer orbitalPeriod;

    /**
     * The average population of sentient beings inhabiting this planet.
     */
    private Double population;

    private PlanetResidentsConnection residentConnection;

    /**
     *
     * The number of standard hours it takes for this planet to complete a single
     * rotation on its axis.
     */
    private Integer rotationPeriod;

    /**
     *
     * The percentage of the planet surface that is naturally occuring water or bodies
     * of water.
     */
    private Double surfaceWater;

    /**
     * The terrains of this planet.
     */
    private List<String> terrains;

    public Planet build() {
                  Planet result = new Planet();
                      result.climates = this.climates;
          result.created = this.created;
          result.diameter = this.diameter;
          result.edited = this.edited;
          result.filmConnection = this.filmConnection;
          result.gravity = this.gravity;
          result.id = this.id;
          result.name = this.name;
          result.orbitalPeriod = this.orbitalPeriod;
          result.population = this.population;
          result.residentConnection = this.residentConnection;
          result.rotationPeriod = this.rotationPeriod;
          result.surfaceWater = this.surfaceWater;
          result.terrains = this.terrains;
                      return result;
    }

    /**
     * The climates of this planet.
     */
    public Planet.Builder climates(List<String> climates) {
      this.climates = climates;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    public Planet.Builder created(String created) {
      this.created = created;
      return this;
    }

    /**
     * The diameter of this planet in kilometers.
     */
    public Planet.Builder diameter(Integer diameter) {
      this.diameter = diameter;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    public Planet.Builder edited(String edited) {
      this.edited = edited;
      return this;
    }

    public Planet.Builder filmConnection(
        PlanetFilmsConnection filmConnection) {
      this.filmConnection = filmConnection;
      return this;
    }

    /**
     *
     * A number denoting the gravity of this planet, where "1" is normal or 1 standard
     * G. "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
     */
    public Planet.Builder gravity(String gravity) {
      this.gravity = gravity;
      return this;
    }

    /**
     * The ID of an object
     */
    public Planet.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of this planet.
     */
    public Planet.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     *
     * The number of standard days it takes for this planet to complete a single orbit
     * of its local star.
     */
    public Planet.Builder orbitalPeriod(Integer orbitalPeriod) {
      this.orbitalPeriod = orbitalPeriod;
      return this;
    }

    /**
     * The average population of sentient beings inhabiting this planet.
     */
    public Planet.Builder population(Double population) {
      this.population = population;
      return this;
    }

    public Planet.Builder residentConnection(
        PlanetResidentsConnection residentConnection) {
      this.residentConnection = residentConnection;
      return this;
    }

    /**
     *
     * The number of standard hours it takes for this planet to complete a single
     * rotation on its axis.
     */
    public Planet.Builder rotationPeriod(
        Integer rotationPeriod) {
      this.rotationPeriod = rotationPeriod;
      return this;
    }

    /**
     *
     * The percentage of the planet surface that is naturally occuring water or bodies
     * of water.
     */
    public Planet.Builder surfaceWater(Double surfaceWater) {
      this.surfaceWater = surfaceWater;
      return this;
    }

    /**
     * The terrains of this planet.
     */
    public Planet.Builder terrains(List<String> terrains) {
      this.terrains = terrains;
      return this;
    }
  }
}
