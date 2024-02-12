package com.graphql.graphql.model.problemiz;

public class SolutionCreateInput {
  private String content;

  private SolutionCategory category;

  private String problemId;

  public SolutionCreateInput() {
  }

  public SolutionCreateInput(String content, SolutionCategory category, String problemId) {
    this.content = content;
    this.category = category;
    this.problemId = problemId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public SolutionCategory getCategory() {
    return category;
  }

  public void setCategory(SolutionCategory category) {
    this.category = category;
  }

  public String getProblemId() {
    return problemId;
  }

  public void setProblemId(String problemId) {
    this.problemId = problemId;
  }

  @Override
  public String toString() {
    return "SolutionCreateInput{" + "content='" + content + "'," +"category='" + category + "'," +"problemId='" + problemId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolutionCreateInput that = (SolutionCreateInput) o;
        return java.util.Objects.equals(content, that.content) &&
                            java.util.Objects.equals(category, that.category) &&
                            java.util.Objects.equals(problemId, that.problemId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(content, category, problemId);
  }

  public static SolutionCreateInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String content;

    private SolutionCategory category;

    private String problemId;

    public SolutionCreateInput build() {
                  SolutionCreateInput result = new SolutionCreateInput();
                      result.content = this.content;
          result.category = this.category;
          result.problemId = this.problemId;
                      return result;
    }

    public SolutionCreateInput.Builder content(String content) {
      this.content = content;
      return this;
    }

    public SolutionCreateInput.Builder category(
        SolutionCategory category) {
      this.category = category;
      return this;
    }

    public SolutionCreateInput.Builder problemId(
        String problemId) {
      this.problemId = problemId;
      return this;
    }
  }
}
