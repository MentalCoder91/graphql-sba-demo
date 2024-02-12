package com.graphql.graphql.model.problemiz;

public class SolutionResponse {
  private Solution solution;

  public SolutionResponse() {
  }

  public SolutionResponse(Solution solution) {
    this.solution = solution;
  }

  public Solution getSolution() {
    return solution;
  }

  public void setSolution(Solution solution) {
    this.solution = solution;
  }

  @Override
  public String toString() {
    return "SolutionResponse{" + "solution='" + solution + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolutionResponse that = (SolutionResponse) o;
        return java.util.Objects.equals(solution, that.solution);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(solution);
  }

  public static SolutionResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Solution solution;

    public SolutionResponse build() {
      SolutionResponse result = new SolutionResponse();
          result.solution = this.solution;
          return result;
    }

    public SolutionResponse.Builder solution(Solution solution) {
      this.solution = solution;
      return this;
    }
  }
}
