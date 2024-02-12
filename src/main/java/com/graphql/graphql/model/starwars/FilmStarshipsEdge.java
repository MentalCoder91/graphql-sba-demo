package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class FilmStarshipsEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Starship node;

  public FilmStarshipsEdge() {
  }

  public FilmStarshipsEdge(String cursor, Starship node) {
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
  public Starship getNode() {
    return node;
  }

  public void setNode(Starship node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "FilmStarshipsEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmStarshipsEdge that = (FilmStarshipsEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static FilmStarshipsEdge.Builder newBuilder() {
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
    private Starship node;

    public FilmStarshipsEdge build() {
                  FilmStarshipsEdge result = new FilmStarshipsEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public FilmStarshipsEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public FilmStarshipsEdge.Builder node(Starship node) {
      this.node = node;
      return this;
    }
  }
}
