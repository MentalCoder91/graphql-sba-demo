package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class FilmSpeciesEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Species node;

  public FilmSpeciesEdge() {
  }

  public FilmSpeciesEdge(String cursor, Species node) {
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
  public Species getNode() {
    return node;
  }

  public void setNode(Species node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "FilmSpeciesEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmSpeciesEdge that = (FilmSpeciesEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static FilmSpeciesEdge.Builder newBuilder() {
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
    private Species node;

    public FilmSpeciesEdge build() {
                  FilmSpeciesEdge result = new FilmSpeciesEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public FilmSpeciesEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public FilmSpeciesEdge.Builder node(Species node) {
      this.node = node;
      return this;
    }
  }
}
