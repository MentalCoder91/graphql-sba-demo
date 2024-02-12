package com.graphql.graphql.model.problemiz;

public class UserResponse {
  private User user;

  private UserAuthToken authToken;

  public UserResponse() {
  }

  public UserResponse(User user, UserAuthToken authToken) {
    this.user = user;
    this.authToken = authToken;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserAuthToken getAuthToken() {
    return authToken;
  }

  public void setAuthToken(UserAuthToken authToken) {
    this.authToken = authToken;
  }

  @Override
  public String toString() {
    return "UserResponse{" + "user='" + user + "'," +"authToken='" + authToken + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse that = (UserResponse) o;
        return java.util.Objects.equals(user, that.user) &&
                            java.util.Objects.equals(authToken, that.authToken);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(user, authToken);
  }

  public static UserResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private User user;

    private UserAuthToken authToken;

    public UserResponse build() {
                  UserResponse result = new UserResponse();
                      result.user = this.user;
          result.authToken = this.authToken;
                      return result;
    }

    public UserResponse.Builder user(User user) {
      this.user = user;
      return this;
    }

    public UserResponse.Builder authToken(
        UserAuthToken authToken) {
      this.authToken = authToken;
      return this;
    }
  }
}
