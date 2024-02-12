package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class FilmPlanetsEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Planet node;

  public FilmPlanetsEdge() {
  }

  public FilmPlanetsEdge(String cursor, Planet node) {
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
  public Planet getNode() {
    return node;
  }

  public void setNode(Planet node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "FilmPlanetsEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmPlanetsEdge that = (FilmPlanetsEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static FilmPlanetsEdge.Builder newBuilder() {
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
    private Planet node;

    public FilmPlanetsEdge build() {
                  FilmPlanetsEdge result = new FilmPlanetsEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public FilmPlanetsEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public FilmPlanetsEdge.Builder node(Planet node) {
      this.node = node;
      return this;
    }
  }
}
