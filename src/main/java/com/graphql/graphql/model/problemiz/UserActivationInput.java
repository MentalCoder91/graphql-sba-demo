package com.graphql.graphql.model.problemiz;

public class UserActivationInput {
  private String username;

  private boolean active;

  public UserActivationInput() {
  }

  public UserActivationInput(String username, boolean active) {
    this.username = username;
    this.active = active;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "UserActivationInput{" + "username='" + username + "'," +"active='" + active + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserActivationInput that = (UserActivationInput) o;
        return java.util.Objects.equals(username, that.username) &&
                            active == that.active;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(username, active);
  }

  public static UserActivationInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String username;

    private boolean active;

    public UserActivationInput build() {
                  UserActivationInput result = new UserActivationInput();
                      result.username = this.username;
          result.active = this.active;
                      return result;
    }

    public UserActivationInput.Builder username(
        String username) {
      this.username = username;
      return this;
    }

    public UserActivationInput.Builder active(boolean active) {
      this.active = active;
      return this;
    }
  }
}
