package com.graphql.graphql.model.problemiz;

public class ProblemResponse {
  private Problem problem;

  public ProblemResponse() {
  }

  public ProblemResponse(Problem problem) {
    this.problem = problem;
  }

  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  @Override
  public String toString() {
    return "ProblemResponse{" + "problem='" + problem + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProblemResponse that = (ProblemResponse) o;
        return java.util.Objects.equals(problem, that.problem);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(problem);
  }

  public static ProblemResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Problem problem;

    public ProblemResponse build() {
      ProblemResponse result = new ProblemResponse();
          result.problem = this.problem;
          return result;
    }

    public ProblemResponse.Builder problem(Problem problem) {
      this.problem = problem;
      return this;
    }
  }
}
