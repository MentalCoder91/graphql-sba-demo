package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 * A single transport craft that does not have hyperdrive capability
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Vehicle implements Node {
  /**
   * The maximum number of kilograms that this vehicle can transport.
   */
  private Double cargoCapacity;

  /**
   *
   * The maximum length of time that this vehicle can provide consumables for its
   * entire crew without having to resupply.
   */
  private String consumables;

  /**
   * The cost of this vehicle new, in Galactic Credits.
   */
  private Double costInCredits;

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  private String created;

  /**
   * The number of personnel needed to run or pilot this vehicle.
   */
  private String crew;

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  private String edited;

  private VehicleFilmsConnection filmConnection;

  /**
   * The ID of an object
   */
  private String id;

  /**
   * The length of this vehicle in meters.
   */
  private Double length;

  /**
   * The manufacturers of this vehicle.
   */
  private List<String> manufacturers;

  /**
   * The maximum speed of this vehicle in atmosphere.
   */
  private Integer maxAtmospheringSpeed;

  /**
   *
   * The model or official name of this vehicle. Such as "All-Terrain Attack
   * Transport".
   */
  private String model;

  /**
   *
   * The name of this vehicle. The common name, such as "Sand Crawler" or "Speeder
   * bike".
   */
  private String name;

  /**
   * The number of non-essential people this vehicle can transport.
   */
  private String passengers;

  private VehiclePilotsConnection pilotConnection;

  /**
   * The class of this vehicle, such as "Wheeled" or "Repulsorcraft".
   */
  private String vehicleClass;

  public Vehicle() {
  }

  public Vehicle(Double cargoCapacity, String consumables, Double costInCredits, String created,
      String crew, String edited, VehicleFilmsConnection filmConnection, String id, Double length,
      List<String> manufacturers, Integer maxAtmospheringSpeed, String model, String name,
      String passengers, VehiclePilotsConnection pilotConnection, String vehicleClass) {
    this.cargoCapacity = cargoCapacity;
    this.consumables = consumables;
    this.costInCredits = costInCredits;
    this.created = created;
    this.crew = crew;
    this.edited = edited;
    this.filmConnection = filmConnection;
    this.id = id;
    this.length = length;
    this.manufacturers = manufacturers;
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    this.model = model;
    this.name = name;
    this.passengers = passengers;
    this.pilotConnection = pilotConnection;
    this.vehicleClass = vehicleClass;
  }

  /**
   * The maximum number of kilograms that this vehicle can transport.
   */
  public Double getCargoCapacity() {
    return cargoCapacity;
  }

  public void setCargoCapacity(Double cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  /**
   *
   * The maximum length of time that this vehicle can provide consumables for its
   * entire crew without having to resupply.
   */
  public String getConsumables() {
    return consumables;
  }

  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }

  /**
   * The cost of this vehicle new, in Galactic Credits.
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
   * The number of personnel needed to run or pilot this vehicle.
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

  public VehicleFilmsConnection getFilmConnection() {
    return filmConnection;
  }

  public void setFilmConnection(VehicleFilmsConnection filmConnection) {
    this.filmConnection = filmConnection;
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
   * The length of this vehicle in meters.
   */
  public Double getLength() {
    return length;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  /**
   * The manufacturers of this vehicle.
   */
  public List<String> getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(List<String> manufacturers) {
    this.manufacturers = manufacturers;
  }

  /**
   * The maximum speed of this vehicle in atmosphere.
   */
  public Integer getMaxAtmospheringSpeed() {
    return maxAtmospheringSpeed;
  }

  public void setMaxAtmospheringSpeed(Integer maxAtmospheringSpeed) {
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
  }

  /**
   *
   * The model or official name of this vehicle. Such as "All-Terrain Attack
   * Transport".
   */
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /**
   *
   * The name of this vehicle. The common name, such as "Sand Crawler" or "Speeder
   * bike".
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of non-essential people this vehicle can transport.
   */
  public String getPassengers() {
    return passengers;
  }

  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  public VehiclePilotsConnection getPilotConnection() {
    return pilotConnection;
  }

  public void setPilotConnection(VehiclePilotsConnection pilotConnection) {
    this.pilotConnection = pilotConnection;
  }

  /**
   * The class of this vehicle, such as "Wheeled" or "Repulsorcraft".
   */
  public String getVehicleClass() {
    return vehicleClass;
  }

  public void setVehicleClass(String vehicleClass) {
    this.vehicleClass = vehicleClass;
  }

  @Override
  public String toString() {
    return "Vehicle{" + "cargoCapacity='" + cargoCapacity + "'," +"consumables='" + consumables + "'," +"costInCredits='" + costInCredits + "'," +"created='" + created + "'," +"crew='" + crew + "'," +"edited='" + edited + "'," +"filmConnection='" + filmConnection + "'," +"id='" + id + "'," +"length='" + length + "'," +"manufacturers='" + manufacturers + "'," +"maxAtmospheringSpeed='" + maxAtmospheringSpeed + "'," +"model='" + model + "'," +"name='" + name + "'," +"passengers='" + passengers + "'," +"pilotConnection='" + pilotConnection + "'," +"vehicleClass='" + vehicleClass + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle that = (Vehicle) o;
        return java.util.Objects.equals(cargoCapacity, that.cargoCapacity) &&
                            java.util.Objects.equals(consumables, that.consumables) &&
                            java.util.Objects.equals(costInCredits, that.costInCredits) &&
                            java.util.Objects.equals(created, that.created) &&
                            java.util.Objects.equals(crew, that.crew) &&
                            java.util.Objects.equals(edited, that.edited) &&
                            java.util.Objects.equals(filmConnection, that.filmConnection) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(length, that.length) &&
                            java.util.Objects.equals(manufacturers, that.manufacturers) &&
                            java.util.Objects.equals(maxAtmospheringSpeed, that.maxAtmospheringSpeed) &&
                            java.util.Objects.equals(model, that.model) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(passengers, that.passengers) &&
                            java.util.Objects.equals(pilotConnection, that.pilotConnection) &&
                            java.util.Objects.equals(vehicleClass, that.vehicleClass);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cargoCapacity, consumables, costInCredits, created, crew, edited, filmConnection, id, length, manufacturers, maxAtmospheringSpeed, model, name, passengers, pilotConnection, vehicleClass);
  }

  public static Vehicle.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The maximum number of kilograms that this vehicle can transport.
     */
    private Double cargoCapacity;

    /**
     *
     * The maximum length of time that this vehicle can provide consumables for its
     * entire crew without having to resupply.
     */
    private String consumables;

    /**
     * The cost of this vehicle new, in Galactic Credits.
     */
    private Double costInCredits;

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * The number of personnel needed to run or pilot this vehicle.
     */
    private String crew;

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    private VehicleFilmsConnection filmConnection;

    /**
     * The ID of an object
     */
    private String id;

    /**
     * The length of this vehicle in meters.
     */
    private Double length;

    /**
     * The manufacturers of this vehicle.
     */
    private List<String> manufacturers;

    /**
     * The maximum speed of this vehicle in atmosphere.
     */
    private Integer maxAtmospheringSpeed;

    /**
     *
     * The model or official name of this vehicle. Such as "All-Terrain Attack
     * Transport".
     */
    private String model;

    /**
     *
     * The name of this vehicle. The common name, such as "Sand Crawler" or "Speeder
     * bike".
     */
    private String name;

    /**
     * The number of non-essential people this vehicle can transport.
     */
    private String passengers;

    private VehiclePilotsConnection pilotConnection;

    /**
     * The class of this vehicle, such as "Wheeled" or "Repulsorcraft".
     */
    private String vehicleClass;

    public Vehicle build() {
                  Vehicle result = new Vehicle();
                      result.cargoCapacity = this.cargoCapacity;
          result.consumables = this.consumables;
          result.costInCredits = this.costInCredits;
          result.created = this.created;
          result.crew = this.crew;
          result.edited = this.edited;
          result.filmConnection = this.filmConnection;
          result.id = this.id;
          result.length = this.length;
          result.manufacturers = this.manufacturers;
          result.maxAtmospheringSpeed = this.maxAtmospheringSpeed;
          result.model = this.model;
          result.name = this.name;
          result.passengers = this.passengers;
          result.pilotConnection = this.pilotConnection;
          result.vehicleClass = this.vehicleClass;
                      return result;
    }

    /**
     * The maximum number of kilograms that this vehicle can transport.
     */
    public Vehicle.Builder cargoCapacity(Double cargoCapacity) {
      this.cargoCapacity = cargoCapacity;
      return this;
    }

    /**
     *
     * The maximum length of time that this vehicle can provide consumables for its
     * entire crew without having to resupply.
     */
    public Vehicle.Builder consumables(String consumables) {
      this.consumables = consumables;
      return this;
    }

    /**
     * The cost of this vehicle new, in Galactic Credits.
     */
    public Vehicle.Builder costInCredits(Double costInCredits) {
      this.costInCredits = costInCredits;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    public Vehicle.Builder created(String created) {
      this.created = created;
      return this;
    }

    /**
     * The number of personnel needed to run or pilot this vehicle.
     */
    public Vehicle.Builder crew(String crew) {
      this.crew = crew;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    public Vehicle.Builder edited(String edited) {
      this.edited = edited;
      return this;
    }

    public Vehicle.Builder filmConnection(
        VehicleFilmsConnection filmConnection) {
      this.filmConnection = filmConnection;
      return this;
    }

    /**
     * The ID of an object
     */
    public Vehicle.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The length of this vehicle in meters.
     */
    public Vehicle.Builder length(Double length) {
      this.length = length;
      return this;
    }

    /**
     * The manufacturers of this vehicle.
     */
    public Vehicle.Builder manufacturers(
        List<String> manufacturers) {
      this.manufacturers = manufacturers;
      return this;
    }

    /**
     * The maximum speed of this vehicle in atmosphere.
     */
    public Vehicle.Builder maxAtmospheringSpeed(
        Integer maxAtmospheringSpeed) {
      this.maxAtmospheringSpeed = maxAtmospheringSpeed;
      return this;
    }

    /**
     *
     * The model or official name of this vehicle. Such as "All-Terrain Attack
     * Transport".
     */
    public Vehicle.Builder model(String model) {
      this.model = model;
      return this;
    }

    /**
     *
     * The name of this vehicle. The common name, such as "Sand Crawler" or "Speeder
     * bike".
     */
    public Vehicle.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The number of non-essential people this vehicle can transport.
     */
    public Vehicle.Builder passengers(String passengers) {
      this.passengers = passengers;
      return this;
    }

    public Vehicle.Builder pilotConnection(
        VehiclePilotsConnection pilotConnection) {
      this.pilotConnection = pilotConnection;
      return this;
    }

    /**
     * The class of this vehicle, such as "Wheeled" or "Repulsorcraft".
     */
    public Vehicle.Builder vehicleClass(String vehicleClass) {
      this.vehicleClass = vehicleClass;
      return this;
    }
  }
}
