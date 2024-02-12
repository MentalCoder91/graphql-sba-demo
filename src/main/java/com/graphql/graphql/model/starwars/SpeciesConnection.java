package com.graphql.graphql.model.starwars;

import graphql.relay.PageInfo;

import java.util.List;

/**
 * A connection to a list of items.
 */
public class SpeciesConnection {
  /**
   * A list of edges.
   */
  private List<SpeciesEdge> edges;

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
  private List<Species> species;

  /**
   *
   * A count of the total number of objects in this connection, ignoring pagination.
   * This allows a client to fetch the first five objects by passing "5" as the
   * argument to "first", then fetch the total count so it could display "5 of 83",
   * for example.
   */
  private Integer totalCount;

  public SpeciesConnection() {
  }

  public SpeciesConnection(List<SpeciesEdge> edges, PageInfo pageInfo, List<Species> species,
      Integer totalCount) {
    this.edges = edges;
    this.pageInfo = pageInfo;
    this.species = species;
    this.totalCount = totalCount;
  }

  /**
   * A list of edges.
   */
  public List<SpeciesEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<SpeciesEdge> edges) {
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
  public List<Species> getSpecies() {
    return species;
  }

  public void setSpecies(List<Species> species) {
    this.species = species;
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
    return "SpeciesConnection{" + "edges='" + edges + "'," +"pageInfo='" + pageInfo + "'," +"species='" + species + "'," +"totalCount='" + totalCount + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeciesConnection that = (SpeciesConnection) o;
        return java.util.Objects.equals(edges, that.edges) &&
                            java.util.Objects.equals(pageInfo, that.pageInfo) &&
                            java.util.Objects.equals(species, that.species) &&
                            java.util.Objects.equals(totalCount, that.totalCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(edges, pageInfo, species, totalCount);
  }

  public static SpeciesConnection.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of edges.
     */
    private List<SpeciesEdge> edges;

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
    private List<Species> species;

    /**
     *
     * A count of the total number of objects in this connection, ignoring pagination.
     * This allows a client to fetch the first five objects by passing "5" as the
     * argument to "first", then fetch the total count so it could display "5 of 83",
     * for example.
     */
    private Integer totalCount;

    public SpeciesConnection build() {
                  SpeciesConnection result = new SpeciesConnection();
                      result.edges = this.edges;
          result.pageInfo = this.pageInfo;
          result.species = this.species;
          result.totalCount = this.totalCount;
                      return result;
    }

    /**
     * A list of edges.
     */
    public SpeciesConnection.Builder edges(
        List<SpeciesEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * Information to aid in pagination.
     */
    public SpeciesConnection.Builder pageInfo(
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
    public SpeciesConnection.Builder species(
        List<Species> species) {
      this.species = species;
      return this;
    }

    /**
     *
     * A count of the total number of objects in this connection, ignoring pagination.
     * This allows a client to fetch the first five objects by passing "5" as the
     * argument to "first", then fetch the total count so it could display "5 of 83",
     * for example.
     */
    public SpeciesConnection.Builder totalCount(
        Integer totalCount) {
      this.totalCount = totalCount;
      return this;
    }
  }
}
