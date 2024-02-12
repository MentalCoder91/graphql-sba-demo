package com.graphql.graphql.model.problemiz;

import java.time.OffsetDateTime;

public class UserAuthToken {
  private String authToken;

  private OffsetDateTime expiryTime;

  public UserAuthToken() {
  }

  public UserAuthToken(String authToken, OffsetDateTime expiryTime) {
    this.authToken = authToken;
    this.expiryTime = expiryTime;
  }

  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  @Override
  public String toString() {
    return "UserAuthToken{" + "authToken='" + authToken + "'," +"expiryTime='" + expiryTime + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAuthToken that = (UserAuthToken) o;
        return java.util.Objects.equals(authToken, that.authToken) &&
                            java.util.Objects.equals(expiryTime, that.expiryTime);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(authToken, expiryTime);
  }

  public static UserAuthToken.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String authToken;

    private OffsetDateTime expiryTime;

    public UserAuthToken build() {
                  UserAuthToken result = new UserAuthToken();
                      result.authToken = this.authToken;
          result.expiryTime = this.expiryTime;
                      return result;
    }

    public UserAuthToken.Builder authToken(String authToken) {
      this.authToken = authToken;
      return this;
    }

    public UserAuthToken.Builder expiryTime(
        OffsetDateTime expiryTime) {
      this.expiryTime = expiryTime;
      return this;
    }
  }
}
