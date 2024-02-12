package com.graphql.graphql.model.problemiz;

import java.net.URL;
import java.time.OffsetDateTime;
import java.util.List;

public class User {
  private String id;

  private String username;

  private String email;

  private URL avatar;

  private OffsetDateTime createDateTime;

  private String displayName;

  private List<Problem> problems;

  public User() {
  }

  public User(String id, String username, String email, URL avatar, OffsetDateTime createDateTime,
      String displayName, List<Problem> problems) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.avatar = avatar;
    this.createDateTime = createDateTime;
    this.displayName = displayName;
    this.problems = problems;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public URL getAvatar() {
    return avatar;
  }

  public void setAvatar(URL avatar) {
    this.avatar = avatar;
  }

  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public List<Problem> getProblems() {
    return problems;
  }

  public void setProblems(List<Problem> problems) {
    this.problems = problems;
  }

  @Override
  public String toString() {
    return "User{" + "id='" + id + "'," +"username='" + username + "'," +"email='" + email + "'," +"avatar='" + avatar + "'," +"createDateTime='" + createDateTime + "'," +"displayName='" + displayName + "'," +"problems='" + problems + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(username, that.username) &&
                            java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(avatar, that.avatar) &&
                            java.util.Objects.equals(createDateTime, that.createDateTime) &&
                            java.util.Objects.equals(displayName, that.displayName) &&
                            java.util.Objects.equals(problems, that.problems);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, username, email, avatar, createDateTime, displayName, problems);
  }

  public static User.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String username;

    private String email;

    private URL avatar;

    private OffsetDateTime createDateTime;

    private String displayName;

    private List<Problem> problems;

    public User build() {
                  User result = new User();
                      result.id = this.id;
          result.username = this.username;
          result.email = this.email;
          result.avatar = this.avatar;
          result.createDateTime = this.createDateTime;
          result.displayName = this.displayName;
          result.problems = this.problems;
                      return result;
    }

    public User.Builder id(String id) {
      this.id = id;
      return this;
    }

    public User.Builder username(String username) {
      this.username = username;
      return this;
    }

    public User.Builder email(String email) {
      this.email = email;
      return this;
    }

    public User.Builder avatar(URL avatar) {
      this.avatar = avatar;
      return this;
    }

    public User.Builder createDateTime(
        OffsetDateTime createDateTime) {
      this.createDateTime = createDateTime;
      return this;
    }

    public User.Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    public User.Builder problems(List<Problem> problems) {
      this.problems = problems;
      return this;
    }
  }
}
