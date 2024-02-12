package com.graphql.graphql.model.problemiz;

public class UserLoginInput {
  private String username;

  private String password;

  public UserLoginInput() {
  }

  public UserLoginInput(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserLoginInput{" + "username='" + username + "'," +"password='" + password + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLoginInput that = (UserLoginInput) o;
        return java.util.Objects.equals(username, that.username) &&
                            java.util.Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(username, password);
  }

  public static UserLoginInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String username;

    private String password;

    public UserLoginInput build() {
                  UserLoginInput result = new UserLoginInput();
                      result.username = this.username;
          result.password = this.password;
                      return result;
    }

    public UserLoginInput.Builder username(String username) {
      this.username = username;
      return this;
    }

    public UserLoginInput.Builder password(String password) {
      this.password = password;
      return this;
    }
  }
}
