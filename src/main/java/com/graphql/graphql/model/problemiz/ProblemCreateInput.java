package com.graphql.graphql.model.problemiz;

import java.util.List;

public class ProblemCreateInput {
  private String title;

  private String content;

  private List<String> tags;

  public ProblemCreateInput() {
  }

  public ProblemCreateInput(String title, String content, List<String> tags) {
    this.title = title;
    this.content = content;
    this.tags = tags;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "ProblemCreateInput{" + "title='" + title + "'," +"content='" + content + "'," +"tags='" + tags + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProblemCreateInput that = (ProblemCreateInput) o;
        return java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(content, that.content) &&
                            java.util.Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(title, content, tags);
  }

  public static ProblemCreateInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String title;

    private String content;

    private List<String> tags;

    public ProblemCreateInput build() {
                  ProblemCreateInput result = new ProblemCreateInput();
                      result.title = this.title;
          result.content = this.content;
          result.tags = this.tags;
                      return result;
    }

    public ProblemCreateInput.Builder title(String title) {
      this.title = title;
      return this;
    }

    public ProblemCreateInput.Builder content(String content) {
      this.content = content;
      return this;
    }

    public ProblemCreateInput.Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
