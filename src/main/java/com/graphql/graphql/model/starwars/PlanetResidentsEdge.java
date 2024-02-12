package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class PlanetResidentsEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Person node;

  public PlanetResidentsEdge() {
  }

  public PlanetResidentsEdge(String cursor, Person node) {
    this.cursor = cursor;
    this.node = node;
  }

  /**
   * A cursor for use in pagination
   */
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  /**
   * The item at the end of the edge
   */
  public Person getNode() {
    return node;
  }

  public void setNode(Person node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "PlanetResidentsEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanetResidentsEdge that = (PlanetResidentsEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static PlanetResidentsEdge.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A cursor for use in pagination
     */
    private String cursor;

    /**
     * The item at the end of the edge
     */
    private Person node;

    public PlanetResidentsEdge build() {
                  PlanetResidentsEdge result = new PlanetResidentsEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public PlanetResidentsEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public PlanetResidentsEdge.Builder node(Person node) {
      this.node = node;
      return this;
    }
  }
}
