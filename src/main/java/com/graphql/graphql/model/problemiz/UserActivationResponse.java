package com.graphql.graphql.model.problemiz;

public class UserActivationResponse {
  private boolean isActive;

  public UserActivationResponse() {
  }

  public UserActivationResponse(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public String toString() {
    return "UserActivationResponse{" + "isActive='" + isActive + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserActivationResponse that = (UserActivationResponse) o;
        return isActive == that.isActive;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(isActive);
  }

  public static UserActivationResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private boolean isActive;

    public UserActivationResponse build() {
      UserActivationResponse result = new UserActivationResponse();
          result.isActive = this.isActive;
          return result;
    }

    public UserActivationResponse.Builder isActive(
        boolean isActive) {
      this.isActive = isActive;
      return this;
    }
  }
}
