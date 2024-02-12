package com.graphql.graphql.model.problemiz;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.OffsetDateTime;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Solution implements SearchableItem {
  private String id;

  private OffsetDateTime createDateTime;

  private String prettyCreateDateTime;

  private String content;

  private SolutionCategory category;

  private Integer voteAsGoodCount;

  private Integer voteAsBadCount;

  private User author;

  public Solution() {
  }

  public Solution(String id, OffsetDateTime createDateTime, String prettyCreateDateTime,
      String content, SolutionCategory category, Integer voteAsGoodCount, Integer voteAsBadCount,
      User author) {
    this.id = id;
    this.createDateTime = createDateTime;
    this.prettyCreateDateTime = prettyCreateDateTime;
    this.content = content;
    this.category = category;
    this.voteAsGoodCount = voteAsGoodCount;
    this.voteAsBadCount = voteAsBadCount;
    this.author = author;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public String getPrettyCreateDateTime() {
    return prettyCreateDateTime;
  }

  public void setPrettyCreateDateTime(String prettyCreateDateTime) {
    this.prettyCreateDateTime = prettyCreateDateTime;
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

  public Integer getVoteAsGoodCount() {
    return voteAsGoodCount;
  }

  public void setVoteAsGoodCount(Integer voteAsGoodCount) {
    this.voteAsGoodCount = voteAsGoodCount;
  }

  public Integer getVoteAsBadCount() {
    return voteAsBadCount;
  }

  public void setVoteAsBadCount(Integer voteAsBadCount) {
    this.voteAsBadCount = voteAsBadCount;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Solution{" + "id='" + id + "'," +"createDateTime='" + createDateTime + "'," +"prettyCreateDateTime='" + prettyCreateDateTime + "'," +"content='" + content + "'," +"category='" + category + "'," +"voteAsGoodCount='" + voteAsGoodCount + "'," +"voteAsBadCount='" + voteAsBadCount + "'," +"author='" + author + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution that = (Solution) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(createDateTime, that.createDateTime) &&
                            java.util.Objects.equals(prettyCreateDateTime, that.prettyCreateDateTime) &&
                            java.util.Objects.equals(content, that.content) &&
                            java.util.Objects.equals(category, that.category) &&
                            java.util.Objects.equals(voteAsGoodCount, that.voteAsGoodCount) &&
                            java.util.Objects.equals(voteAsBadCount, that.voteAsBadCount) &&
                            java.util.Objects.equals(author, that.author);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, createDateTime, prettyCreateDateTime, content, category, voteAsGoodCount, voteAsBadCount, author);
  }

  public static Solution.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private OffsetDateTime createDateTime;

    private String prettyCreateDateTime;

    private String content;

    private SolutionCategory category;

    private Integer voteAsGoodCount;

    private Integer voteAsBadCount;

    private User author;

    public Solution build() {
                  Solution result = new Solution();
                      result.id = this.id;
          result.createDateTime = this.createDateTime;
          result.prettyCreateDateTime = this.prettyCreateDateTime;
          result.content = this.content;
          result.category = this.category;
          result.voteAsGoodCount = this.voteAsGoodCount;
          result.voteAsBadCount = this.voteAsBadCount;
          result.author = this.author;
                      return result;
    }

    public Solution.Builder id(String id) {
      this.id = id;
      return this;
    }

    public Solution.Builder createDateTime(
        OffsetDateTime createDateTime) {
      this.createDateTime = createDateTime;
      return this;
    }

    public Solution.Builder prettyCreateDateTime(
        String prettyCreateDateTime) {
      this.prettyCreateDateTime = prettyCreateDateTime;
      return this;
    }

    public Solution.Builder content(String content) {
      this.content = content;
      return this;
    }

    public Solution.Builder category(SolutionCategory category) {
      this.category = category;
      return this;
    }

    public Solution.Builder voteAsGoodCount(
        Integer voteAsGoodCount) {
      this.voteAsGoodCount = voteAsGoodCount;
      return this;
    }

    public Solution.Builder voteAsBadCount(
        Integer voteAsBadCount) {
      this.voteAsBadCount = voteAsBadCount;
      return this;
    }

    public Solution.Builder author(User author) {
      this.author = author;
      return this;
    }
  }
}
