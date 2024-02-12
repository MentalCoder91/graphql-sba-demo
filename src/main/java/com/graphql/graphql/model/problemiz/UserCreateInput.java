package com.graphql.graphql.model.problemiz;

import java.net.URL;

public class UserCreateInput {
  private String username;

  private String email;

  private String password;

  private String displayName;

  private URL avatar;

  public UserCreateInput() {
  }

  public UserCreateInput(String username, String email, String password, String displayName,
      URL avatar) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.displayName = displayName;
    this.avatar = avatar;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public URL getAvatar() {
    return avatar;
  }

  public void setAvatar(URL avatar) {
    this.avatar = avatar;
  }

  @Override
  public String toString() {
    return "UserCreateInput{" + "username='" + username + "'," +"email='" + email + "'," +"password='" + password + "'," +"displayName='" + displayName + "'," +"avatar='" + avatar + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCreateInput that = (UserCreateInput) o;
        return java.util.Objects.equals(username, that.username) &&
                            java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(password, that.password) &&
                            java.util.Objects.equals(displayName, that.displayName) &&
                            java.util.Objects.equals(avatar, that.avatar);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(username, email, password, displayName, avatar);
  }

  public static UserCreateInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String username;

    private String email;

    private String password;

    private String displayName;

    private URL avatar;

    public UserCreateInput build() {
                  UserCreateInput result = new UserCreateInput();
                      result.username = this.username;
          result.email = this.email;
          result.password = this.password;
          result.displayName = this.displayName;
          result.avatar = this.avatar;
                      return result;
    }

    public UserCreateInput.Builder username(String username) {
      this.username = username;
      return this;
    }

    public UserCreateInput.Builder email(String email) {
      this.email = email;
      return this;
    }

    public UserCreateInput.Builder password(String password) {
      this.password = password;
      return this;
    }

    public UserCreateInput.Builder displayName(
        String displayName) {
      this.displayName = displayName;
      return this;
    }

    public UserCreateInput.Builder avatar(URL avatar) {
      this.avatar = avatar;
      return this;
    }
  }
}
