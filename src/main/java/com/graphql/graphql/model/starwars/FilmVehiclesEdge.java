package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class FilmVehiclesEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Vehicle node;

  public FilmVehiclesEdge() {
  }

  public FilmVehiclesEdge(String cursor, Vehicle node) {
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
  public Vehicle getNode() {
    return node;
  }

  public void setNode(Vehicle node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "FilmVehiclesEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmVehiclesEdge that = (FilmVehiclesEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static FilmVehiclesEdge.Builder newBuilder() {
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
    private Vehicle node;

    public FilmVehiclesEdge build() {
                  FilmVehiclesEdge result = new FilmVehiclesEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public FilmVehiclesEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public FilmVehiclesEdge.Builder node(Vehicle node) {
      this.node = node;
      return this;
    }
  }
}
