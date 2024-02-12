package com.graphql.graphql.model.starwars;

/**
 * An edge in a connection.
 */
public class VehiclePilotsEdge {
  /**
   * A cursor for use in pagination
   */
  private String cursor;

  /**
   * The item at the end of the edge
   */
  private Person node;

  public VehiclePilotsEdge() {
  }

  public VehiclePilotsEdge(String cursor, Person node) {
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
    return "VehiclePilotsEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiclePilotsEdge that = (VehiclePilotsEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static VehiclePilotsEdge.Builder newBuilder() {
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

    public VehiclePilotsEdge build() {
                  VehiclePilotsEdge result = new VehiclePilotsEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    /**
     * A cursor for use in pagination
     */
    public VehiclePilotsEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of the edge
     */
    public VehiclePilotsEdge.Builder node(Person node) {
      this.node = node;
      return this;
    }
  }
}
