package com.graphql.graphql.model.starwars;

import graphql.relay.PageInfo;

import java.util.List;

/**
 * A connection to a list of items.
 */
public class PersonVehiclesConnection {
  /**
   * A list of edges.
   */
  private List<PersonVehiclesEdge> edges;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  /**
   *
   * A count of the total number of objects in this connection, ignoring pagination.
   * This allows a client to fetch the first five objects by passing "5" as the
   * argument to "first", then fetch the total count so it could display "5 of 83",
   * for example.
   */
  private Integer totalCount;

  /**
   *
   * A list of all of the objects returned in the connection. This is a convenience
   * field provided for quickly exploring the API; rather than querying for
   * "{ edges { node } }" when no edge data is needed, this field can be be used
   * instead. Note that when clients like Relay need to fetch the "cursor" field on
   * the edge to enable efficient pagination, this shortcut cannot be used, and the
   * full "{ edges { node } }" version should be used instead.
   */
  private List<Vehicle> vehicles;

  public PersonVehiclesConnection() {
  }

  public PersonVehiclesConnection(List<PersonVehiclesEdge> edges, PageInfo pageInfo,
      Integer totalCount, List<Vehicle> vehicles) {
    this.edges = edges;
    this.pageInfo = pageInfo;
    this.totalCount = totalCount;
    this.vehicles = vehicles;
  }

  /**
   * A list of edges.
   */
  public List<PersonVehiclesEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<PersonVehiclesEdge> edges) {
    this.edges = edges;
  }

  /**
   * Information to aid in pagination.
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  /**
   *
   * A count of the total number of objects in this connection, ignoring pagination.
   * This allows a client to fetch the first five objects by passing "5" as the
   * argument to "first", then fetch the total count so it could display "5 of 83",
   * for example.
   */
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  /**
   *
   * A list of all of the objects returned in the connection. This is a convenience
   * field provided for quickly exploring the API; rather than querying for
   * "{ edges { node } }" when no edge data is needed, this field can be be used
   * instead. Note that when clients like Relay need to fetch the "cursor" field on
   * the edge to enable efficient pagination, this shortcut cannot be used, and the
   * full "{ edges { node } }" version should be used instead.
   */
  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  @Override
  public String toString() {
    return "PersonVehiclesConnection{" + "edges='" + edges + "'," +"pageInfo='" + pageInfo + "'," +"totalCount='" + totalCount + "'," +"vehicles='" + vehicles + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVehiclesConnection that = (PersonVehiclesConnection) o;
        return java.util.Objects.equals(edges, that.edges) &&
                            java.util.Objects.equals(pageInfo, that.pageInfo) &&
                            java.util.Objects.equals(totalCount, that.totalCount) &&
                            java.util.Objects.equals(vehicles, that.vehicles);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(edges, pageInfo, totalCount, vehicles);
  }

  public static PersonVehiclesConnection.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<PersonVehiclesEdge> edges;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    /**
     *
     * A count of the total number of objects in this connection, ignoring pagination.
     * This allows a client to fetch the first five objects by passing "5" as the
     * argument to "first", then fetch the total count so it could display "5 of 83",
     * for example.
     */
    private Integer totalCount;

    /**
     *
     * A list of all of the objects returned in the connection. This is a convenience
     * field provided for quickly exploring the API; rather than querying for
     * "{ edges { node } }" when no edge data is needed, this field can be be used
     * instead. Note that when clients like Relay need to fetch the "cursor" field on
     * the edge to enable efficient pagination, this shortcut cannot be used, and the
     * full "{ edges { node } }" version should be used instead.
     */
    private List<Vehicle> vehicles;

    public PersonVehiclesConnection build() {
                  PersonVehiclesConnection result = new PersonVehiclesConnection();
                      result.edges = this.edges;
          result.pageInfo = this.pageInfo;
          result.totalCount = this.totalCount;
          result.vehicles = this.vehicles;
                      return result;
    }

    /**
     * A list of edges.
     */
    public PersonVehiclesConnection.Builder edges(
        List<PersonVehiclesEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * Information to aid in pagination.
     */
    public PersonVehiclesConnection.Builder pageInfo(
        PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }

    /**
     *
     * A count of the total number of objects in this connection, ignoring pagination.
     * This allows a client to fetch the first five objects by passing "5" as the
     * argument to "first", then fetch the total count so it could display "5 of 83",
     * for example.
     */
    public PersonVehiclesConnection.Builder totalCount(
        Integer totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    /**
     *
     * A list of all of the objects returned in the connection. This is a convenience
     * field provided for quickly exploring the API; rather than querying for
     * "{ edges { node } }" when no edge data is needed, this field can be be used
     * instead. Note that when clients like Relay need to fetch the "cursor" field on
     * the edge to enable efficient pagination, this shortcut cannot be used, and the
     * full "{ edges { node } }" version should be used instead.
     */
    public PersonVehiclesConnection.Builder vehicles(
        List<Vehicle> vehicles) {
      this.vehicles = vehicles;
      return this;
    }
  }
}
