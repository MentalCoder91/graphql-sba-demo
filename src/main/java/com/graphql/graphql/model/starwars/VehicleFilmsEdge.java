package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class VehicleFilmsEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Film node;

  public VehicleFilmsEdge() {
  }

  public VehicleFilmsEdge(String cursor, Film node) {
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
    return "VehicleFilmsEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleFilmsEdge that = (VehicleFilmsEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static VehicleFilmsEdge.Builder newBuilder() {
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

    public VehicleFilmsEdge build() {
                  VehicleFilmsEdge result = new VehicleFilmsEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public VehicleFilmsEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public VehicleFilmsEdge.Builder node(Film node) {
      this.node = node;
      return this;
    }
  }
}
