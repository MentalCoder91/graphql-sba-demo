package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class PersonFilmsEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Film node;

  public PersonFilmsEdge() {
  }

  public PersonFilmsEdge(String cursor, Film node) {
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
  public Film getNode() {
    return node;
  }

  public void setNode(Film node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "PersonFilmsEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonFilmsEdge that = (PersonFilmsEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static PersonFilmsEdge.Builder newBuilder() {
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
    private Film node;

    public PersonFilmsEdge build() {
                  PersonFilmsEdge result = new PersonFilmsEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public PersonFilmsEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public PersonFilmsEdge.Builder node(Film node) {
      this.node = node;
      return this;
    }
  }
}
