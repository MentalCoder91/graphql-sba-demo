package com.graphql.graphql.model.starwars;

import graphql.relay.PageInfo;

import java.util.List;

/**
 * A connection to a list of items.
 */
public class VehicleFilmsConnection {
  /**
   * A list of edges.
   */
  private List<VehicleFilmsEdge> edges;

  /**
   *
   * A list of all of the objects returned in the connection. This is a convenience
   * field provided for quickly exploring the API; rather than querying for
   * "{ edges { node } }" when no edge data is needed, this field can be be used
   * instead. Note that when clients like Relay need to fetch the "cursor" field on
   * the edge to enable efficient pagination, this shortcut cannot be used, and the
   * full "{ edges { node } }" version should be used instead.
   */
  private List<Film> films;

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

  public VehicleFilmsConnection() {
  }

  public VehicleFilmsConnection(List<VehicleFilmsEdge> edges, List<Film> films, PageInfo pageInfo,
      Integer totalCount) {
    this.edges = edges;
    this.films = films;
    this.pageInfo = pageInfo;
    this.totalCount = totalCount;
  }

  /**
   * A list of edges.
   */
  public List<VehicleFilmsEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<VehicleFilmsEdge> edges) {
    this.edges = edges;
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
  public List<Film> getFilms() {
    return films;
  }

  public void setFilms(List<Film> films) {
    this.films = films;
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

  @Override
  public String toString() {
    return "VehicleFilmsConnection{" + "edges='" + edges + "'," +"films='" + films + "'," +"pageInfo='" + pageInfo + "'," +"totalCount='" + totalCount + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleFilmsConnection that = (VehicleFilmsConnection) o;
        return java.util.Objects.equals(edges, that.edges) &&
                            java.util.Objects.equals(films, that.films) &&
                            java.util.Objects.equals(pageInfo, that.pageInfo) &&
                            java.util.Objects.equals(totalCount, that.totalCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(edges, films, pageInfo, totalCount);
  }

  public static VehicleFilmsConnection.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<VehicleFilmsEdge> edges;

    /**
     *
     * A list of all of the objects returned in the connection. This is a convenience
     * field provided for quickly exploring the API; rather than querying for
     * "{ edges { node } }" when no edge data is needed, this field can be be used
     * instead. Note that when clients like Relay need to fetch the "cursor" field on
     * the edge to enable efficient pagination, this shortcut cannot be used, and the
     * full "{ edges { node } }" version should be used instead.
     */
    private List<Film> films;

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

    public VehicleFilmsConnection build() {
                  VehicleFilmsConnection result = new VehicleFilmsConnection();
                      result.edges = this.edges;
          result.films = this.films;
          result.pageInfo = this.pageInfo;
          result.totalCount = this.totalCount;
                      return result;
    }

    /**
     * A list of edges.
     */
    public VehicleFilmsConnection.Builder edges(
        List<VehicleFilmsEdge> edges) {
      this.edges = edges;
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
    public VehicleFilmsConnection.Builder films(
        List<Film> films) {
      this.films = films;
      return this;
    }

    /**
     * Information to aid in pagination.
     */
    public VehicleFilmsConnection.Builder pageInfo(
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
    public VehicleFilmsConnection.Builder totalCount(
        Integer totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
