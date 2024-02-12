package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 * A single transport craft that has hyperdrive capability.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Starship implements Node {
  /**
   *
   * The Maximum number of Megalights this starship can travel in a standard hour.
   * A "Megalight" is a standard unit of distance and has never been defined before
   * within the Star Wars universe. This figure is only really useful for measuring
   * the difference in speed of starships. We can assume it is similar to AU, the
   * distance between our Sun (Sol) and Earth.
   */
  private Integer MGLT;

  /**
   * The maximum number of kilograms that this starship can transport.
   */
  private Double cargoCapacity;

  /**
   *
   * The maximum length of time that this starship can provide consumables for its
   * entire crew without having to resupply.
   */
  private String consumables;

  /**
   * The cost of this starship new, in galactic credits.
   */
  private Double costInCredits;

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  private String created;

  /**
   * The number of personnel needed to run or pilot this starship.
   */
  private String crew;

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  private String edited;

  private StarshipFilmsConnection filmConnection;

  /**
   * The class of this starships hyperdrive.
   */
  private Double hyperdriveRating;

  /**
   * The ID of an object
   */
  private String id;

  /**
   * The length of this starship in meters.
   */
  private Double length;

  /**
   * The manufacturers of this starship.
   */
  private List<String> manufacturers;

  /**
   *
   * The maximum speed of this starship in atmosphere. null if this starship is
   * incapable of atmosphering flight.
   */
  private Integer maxAtmospheringSpeed;

  /**
   *
   * The model or official name of this starship. Such as "T-65 X-wing" or "DS-1
   * Orbital Battle Station".
   */
  private String model;

  /**
   * The name of this starship. The common name, such as "Death Star".
   */
  private String name;

  /**
   * The number of non-essential people this starship can transport.
   */
  private String passengers;

  private StarshipPilotsConnection pilotConnection;

  /**
   *
   * The class of this starship, such as "Starfighter" or "Deep Space Mobile
   * Battlestation"
   */
  private String starshipClass;

  public Starship() {
  }

  public Starship(Integer MGLT, Double cargoCapacity, String consumables, Double costInCredits,
      String created, String crew, String edited, StarshipFilmsConnection filmConnection,
      Double hyperdriveRating, String id, Double length, List<String> manufacturers,
      Integer maxAtmospheringSpeed, String model, String name, String passengers,
      StarshipPilotsConnection pilotConnection, String starshipClass) {
    this.MGLT = MGLT;
    this.cargoCapacity = cargoCapacity;
    this.consumables = consumables;
    this.costInCredits = costInCredits;
    this.created = created;
    this.crew = crew;
    this.edited = edited;
    this.filmConnection = filmConnection;
    this.hyperdriveRating = hyperdriveRating;
    this.id = id;
    this.length = length;
    this.manufacturers = manufacturers;
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    this.model = model;
    this.name = name;
    this.passengers = passengers;
    this.pilotConnection = pilotConnection;
    this.starshipClass = starshipClass;
  }

  /**
   *
   * The Maximum number of Megalights this starship can travel in a standard hour.
   * A "Megalight" is a standard unit of distance and has never been defined before
   * within the Star Wars universe. This figure is only really useful for measuring
   * the difference in speed of starships. We can assume it is similar to AU, the
   * distance between our Sun (Sol) and Earth.
   */
  public Integer getMGLT() {
    return MGLT;
  }

  public void setMGLT(Integer MGLT) {
    this.MGLT = MGLT;
  }

  /**
   * The maximum number of kilograms that this starship can transport.
   */
  public Double getCargoCapacity() {
    return cargoCapacity;
  }

  public void setCargoCapacity(Double cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  /**
   *
   * The maximum length of time that this starship can provide consumables for its
   * entire crew without having to resupply.
   */
  public String getConsumables() {
    return consumables;
  }

  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }

  /**
   * The cost of this starship new, in galactic credits.
   */
  public Double getCostInCredits() {
    return costInCredits;
  }

  public void setCostInCredits(Double costInCredits) {
    this.costInCredits = costInCredits;
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
   * The number of personnel needed to run or pilot this starship.
   */
  public String getCrew() {
    return crew;
  }

  public void setCrew(String crew) {
    this.crew = crew;
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

  public StarshipFilmsConnection getFilmConnection() {
    return filmConnection;
  }

  public void setFilmConnection(StarshipFilmsConnection filmConnection) {
    this.filmConnection = filmConnection;
  }

  /**
   * The class of this starships hyperdrive.
   */
  public Double getHyperdriveRating() {
    return hyperdriveRating;
  }

  public void setHyperdriveRating(Double hyperdriveRating) {
    this.hyperdriveRating = hyperdriveRating;
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
   * The length of this starship in meters.
   */
  public Double getLength() {
    return length;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  /**
   * The manufacturers of this starship.
   */
  public List<String> getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(List<String> manufacturers) {
    this.manufacturers = manufacturers;
  }

  /**
   *
   * The maximum speed of this starship in atmosphere. null if this starship is
   * incapable of atmosphering flight.
   */
  public Integer getMaxAtmospheringSpeed() {
    return maxAtmospheringSpeed;
  }

  public void setMaxAtmospheringSpeed(Integer maxAtmospheringSpeed) {
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
  }

  /**
   *
   * The model or official name of this starship. Such as "T-65 X-wing" or "DS-1
   * Orbital Battle Station".
   */
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The name of this starship. The common name, such as "Death Star".
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of non-essential people this starship can transport.
   */
  public String getPassengers() {
    return passengers;
  }

  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  public StarshipPilotsConnection getPilotConnection() {
    return pilotConnection;
  }

  public void setPilotConnection(StarshipPilotsConnection pilotConnection) {
    this.pilotConnection = pilotConnection;
  }

  /**
   *
   * The class of this starship, such as "Starfighter" or "Deep Space Mobile
   * Battlestation"
   */
  public String getStarshipClass() {
    return starshipClass;
  }

  public void setStarshipClass(String starshipClass) {
    this.starshipClass = starshipClass;
  }

  @Override
  public String toString() {
    return "Starship{" + "MGLT='" + MGLT + "'," +"cargoCapacity='" + cargoCapacity + "'," +"consumables='" + consumables + "'," +"costInCredits='" + costInCredits + "'," +"created='" + created + "'," +"crew='" + crew + "'," +"edited='" + edited + "'," +"filmConnection='" + filmConnection + "'," +"hyperdriveRating='" + hyperdriveRating + "'," +"id='" + id + "'," +"length='" + length + "'," +"manufacturers='" + manufacturers + "'," +"maxAtmospheringSpeed='" + maxAtmospheringSpeed + "'," +"model='" + model + "'," +"name='" + name + "'," +"passengers='" + passengers + "'," +"pilotConnection='" + pilotConnection + "'," +"starshipClass='" + starshipClass + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Starship that = (Starship) o;
        return java.util.Objects.equals(MGLT, that.MGLT) &&
                            java.util.Objects.equals(cargoCapacity, that.cargoCapacity) &&
                            java.util.Objects.equals(consumables, that.consumables) &&
                            java.util.Objects.equals(costInCredits, that.costInCredits) &&
                            java.util.Objects.equals(created, that.created) &&
                            java.util.Objects.equals(crew, that.crew) &&
                            java.util.Objects.equals(edited, that.edited) &&
                            java.util.Objects.equals(filmConnection, that.filmConnection) &&
                            java.util.Objects.equals(hyperdriveRating, that.hyperdriveRating) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(length, that.length) &&
                            java.util.Objects.equals(manufacturers, that.manufacturers) &&
                            java.util.Objects.equals(maxAtmospheringSpeed, that.maxAtmospheringSpeed) &&
                            java.util.Objects.equals(model, that.model) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(passengers, that.passengers) &&
                            java.util.Objects.equals(pilotConnection, that.pilotConnection) &&
                            java.util.Objects.equals(starshipClass, that.starshipClass);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(MGLT, cargoCapacity, consumables, costInCredits, created, crew, edited, filmConnection, hyperdriveRating, id, length, manufacturers, maxAtmospheringSpeed, model, name, passengers, pilotConnection, starshipClass);
  }

  public static Starship.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     *
     * The Maximum number of Megalights this starship can travel in a standard hour.
     * A "Megalight" is a standard unit of distance and has never been defined before
     * within the Star Wars universe. This figure is only really useful for measuring
     * the difference in speed of starships. We can assume it is similar to AU, the
     * distance between our Sun (Sol) and Earth.
     */
    private Integer MGLT;

    /**
     * The maximum number of kilograms that this starship can transport.
     */
    private Double cargoCapacity;

    /**
     *
     * The maximum length of time that this starship can provide consumables for its
     * entire crew without having to resupply.
     */
    private String consumables;

    /**
     * The cost of this starship new, in galactic credits.
     */
    private Double costInCredits;

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * The number of personnel needed to run or pilot this starship.
     */
    private String crew;

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    private StarshipFilmsConnection filmConnection;

    /**
     * The class of this starships hyperdrive.
     */
    private Double hyperdriveRating;

    /**
     * The ID of an object
     */
    private String id;

    /**
     * The length of this starship in meters.
     */
    private Double length;

    /**
     * The manufacturers of this starship.
     */
    private List<String> manufacturers;

    /**
     *
     * The maximum speed of this starship in atmosphere. null if this starship is
     * incapable of atmosphering flight.
     */
    private Integer maxAtmospheringSpeed;

    /**
     *
     * The model or official name of this starship. Such as "T-65 X-wing" or "DS-1
     * Orbital Battle Station".
     */
    private String model;

    /**
     * The name of this starship. The common name, such as "Death Star".
     */
    private String name;

    /**
     * The number of non-essential people this starship can transport.
     */
    private String passengers;

    private StarshipPilotsConnection pilotConnection;

    /**
     *
     * The class of this starship, such as "Starfighter" or "Deep Space Mobile
     * Battlestation"
     */
    private String starshipClass;

    public Starship build() {
                  Starship result = new Starship();
                      result.MGLT = this.MGLT;
          result.cargoCapacity = this.cargoCapacity;
          result.consumables = this.consumables;
          result.costInCredits = this.costInCredits;
          result.created = this.created;
          result.crew = this.crew;
          result.edited = this.edited;
          result.filmConnection = this.filmConnection;
          result.hyperdriveRating = this.hyperdriveRating;
          result.id = this.id;
          result.length = this.length;
          result.manufacturers = this.manufacturers;
          result.maxAtmospheringSpeed = this.maxAtmospheringSpeed;
          result.model = this.model;
          result.name = this.name;
          result.passengers = this.passengers;
          result.pilotConnection = this.pilotConnection;
          result.starshipClass = this.starshipClass;
                      return result;
    }

    /**
     *
     * The Maximum number of Megalights this starship can travel in a standard hour.
     * A "Megalight" is a standard unit of distance and has never been defined before
     * within the Star Wars universe. This figure is only really useful for measuring
     * the difference in speed of starships. We can assume it is similar to AU, the
     * distance between our Sun (Sol) and Earth.
     */
    public Starship.Builder MGLT(Integer MGLT) {
      this.MGLT = MGLT;
      return this;
    }

    /**
     * The maximum number of kilograms that this starship can transport.
     */
    public Starship.Builder cargoCapacity(Double cargoCapacity) {
      this.cargoCapacity = cargoCapacity;
      return this;
    }

    /**
     *
     * The maximum length of time that this starship can provide consumables for its
     * entire crew without having to resupply.
     */
    public Starship.Builder consumables(String consumables) {
      this.consumables = consumables;
      return this;
    }

    /**
     * The cost of this starship new, in galactic credits.
     */
    public Starship.Builder costInCredits(Double costInCredits) {
      this.costInCredits = costInCredits;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    public Starship.Builder created(String created) {
      this.created = created;
      return this;
    }

    /**
     * The number of personnel needed to run or pilot this starship.
     */
    public Starship.Builder crew(String crew) {
      this.crew = crew;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    public Starship.Builder edited(String edited) {
      this.edited = edited;
      return this;
    }

    public Starship.Builder filmConnection(
        StarshipFilmsConnection filmConnection) {
      this.filmConnection = filmConnection;
      return this;
    }

    /**
     * The class of this starships hyperdrive.
     */
    public Starship.Builder hyperdriveRating(
        Double hyperdriveRating) {
      this.hyperdriveRating = hyperdriveRating;
      return this;
    }

    /**
     * The ID of an object
     */
    public Starship.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The length of this starship in meters.
     */
    public Starship.Builder length(Double length) {
      this.length = length;
      return this;
    }

    /**
     * The manufacturers of this starship.
     */
    public Starship.Builder manufacturers(
        List<String> manufacturers) {
      this.manufacturers = manufacturers;
      return this;
    }

    /**
     *
     * The maximum speed of this starship in atmosphere. null if this starship is
     * incapable of atmosphering flight.
     */
    public Starship.Builder maxAtmospheringSpeed(
        Integer maxAtmospheringSpeed) {
      this.maxAtmospheringSpeed = maxAtmospheringSpeed;
      return this;
    }

    /**
     *
     * The model or official name of this starship. Such as "T-65 X-wing" or "DS-1
     * Orbital Battle Station".
     */
    public Starship.Builder model(String model) {
      this.model = model;
      return this;
    }

    /**
     * The name of this starship. The common name, such as "Death Star".
     */
    public Starship.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The number of non-essential people this starship can transport.
     */
    public Starship.Builder passengers(String passengers) {
      this.passengers = passengers;
      return this;
    }

    public Starship.Builder pilotConnection(
        StarshipPilotsConnection pilotConnection) {
      this.pilotConnection = pilotConnection;
      return this;
    }

    /**
     *
     * The class of this starship, such as "Starfighter" or "Deep Space Mobile
     * Battlestation"
     */
    public Starship.Builder starshipClass(String starshipClass) {
      this.starshipClass = starshipClass;
      return this;
    }
  }
}
