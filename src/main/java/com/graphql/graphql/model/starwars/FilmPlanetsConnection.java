package com.graphql.graphql.model.starwars;

import graphql.relay.PageInfo;

import java.util.List;

/**
 * A connection to a list of items.
 */
public class FilmPlanetsConnection {
  /**
   * A list of edges.
   */
  private List<FilmPlanetsEdge> edges;

  /**
   * Information to aid in pagination.
   */
  private PageInfo pageInfo;

  /**
   *
   * A list of all of the objects returned in the connection. This is a convenience
   * field provided for quickly exploring the API; rather than querying for
   * "{ edges { node } }" when no edge data is needed, this field can be be used
   * instead. Note that when clients like Relay need to fetch the "cursor" field on
   * the edge to enable efficient pagination, this shortcut cannot be used, and the
   * full "{ edges { node } }" version should be used instead.
   */
  private List<Planet> planets;

  /**
   *
   * A count of the total number of objects in this connection, ignoring pagination.
   * This allows a client to fetch the first five objects by passing "5" as the
   * argument to "first", then fetch the total count so it could display "5 of 83",
   * for example.
   */
  private Integer totalCount;

  public FilmPlanetsConnection() {
  }

  public FilmPlanetsConnection(List<FilmPlanetsEdge> edges, PageInfo pageInfo, List<Planet> planets,
      Integer totalCount) {
    this.edges = edges;
    this.pageInfo = pageInfo;
    this.planets = planets;
    this.totalCount = totalCount;
  }

  /**
   * A list of edges.
   */
  public List<FilmPlanetsEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<FilmPlanetsEdge> edges) {
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
   * A list of all of the objects returned in the connection. This is a convenience
   * field provided for quickly exploring the API; rather than querying for
   * "{ edges { node } }" when no edge data is needed, this field can be be used
   * instead. Note that when clients like Relay need to fetch the "cursor" field on
   * the edge to enable efficient pagination, this shortcut cannot be used, and the
   * full "{ edges { node } }" version should be used instead.
   */
  public List<Planet> getPlanets() {
    return planets;
  }

  public void setPlanets(List<Planet> planets) {
    this.planets = planets;
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
    return "FilmPlanetsConnection{" + "edges='" + edges + "'," +"pageInfo='" + pageInfo + "'," +"planets='" + planets + "'," +"totalCount='" + totalCount + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmPlanetsConnection that = (FilmPlanetsConnection) o;
        return java.util.Objects.equals(edges, that.edges) &&
                            java.util.Objects.equals(pageInfo, that.pageInfo) &&
                            java.util.Objects.equals(planets, that.planets) &&
                            java.util.Objects.equals(totalCount, that.totalCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(edges, pageInfo, planets, totalCount);
  }

  public static FilmPlanetsConnection.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<FilmPlanetsEdge> edges;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    /**
     *
     * A list of all of the objects returned in the connection. This is a convenience
     * field provided for quickly exploring the API; rather than querying for
     * "{ edges { node } }" when no edge data is needed, this field can be be used
     * instead. Note that when clients like Relay need to fetch the "cursor" field on
     * the edge to enable efficient pagination, this shortcut cannot be used, and the
     * full "{ edges { node } }" version should be used instead.
     */
    private List<Planet> planets;

    /**
     *
     * A count of the total number of objects in this connection, ignoring pagination.
     * This allows a client to fetch the first five objects by passing "5" as the
     * argument to "first", then fetch the total count so it could display "5 of 83",
     * for example.
     */
    private Integer totalCount;

    public FilmPlanetsConnection build() {
                  FilmPlanetsConnection result = new FilmPlanetsConnection();
                      result.edges = this.edges;
          result.pageInfo = this.pageInfo;
          result.planets = this.planets;
          result.totalCount = this.totalCount;
                      return result;
    }

    /**
     * A list of edges.
     */
    public FilmPlanetsConnection.Builder edges(
        List<FilmPlanetsEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * Information to aid in pagination.
     */
    public FilmPlanetsConnection.Builder pageInfo(
        PageInfo pageInfo) {
      this.pageInfo = pageInfo;
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
    public FilmPlanetsConnection.Builder planets(
        List<Planet> planets) {
      this.planets = planets;
      return this;
    }

    /**
     *
     * A count of the total number of objects in this connection, ignoring pagination.
     * This allows a client to fetch the first five objects by passing "5" as the
     * argument to "first", then fetch the total count so it could display "5 of 83",
     * for example.
     */
    public FilmPlanetsConnection.Builder totalCount(
        Integer totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
