package com.graphql.graphql.model;

public class HelloInput {
  private String text;

  private int number;

  public HelloInput() {
  }

  public HelloInput(String text, int number) {
    this.text = text;
    this.number = number;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "HelloInput{" + "text='" + text + "'," +"number='" + number + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloInput that = (HelloInput) o;
        return java.util.Objects.equals(text, that.text) &&
                            number == that.number;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(text, number);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String text;

    private int number;

    public HelloInput build() {
                  HelloInput result = new HelloInput();
                      result.text = this.text;
          result.number = this.number;
                      return result;
    }

    public Builder text(String text) {
      this.text = text;
      return this;
    }

    public Builder number(int number) {
      this.number = number;
      return this;
    }
  }
}
