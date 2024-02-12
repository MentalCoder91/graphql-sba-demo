package com.graphql.graphql.model.problemiz;

public class SolutionVoteInput {
  private String solutionId;

  private boolean voteAsGood;

  public SolutionVoteInput() {
  }

  public SolutionVoteInput(String solutionId, boolean voteAsGood) {
    this.solutionId = solutionId;
    this.voteAsGood = voteAsGood;
  }

  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }

  public boolean getVoteAsGood() {
    return voteAsGood;
  }

  public void setVoteAsGood(boolean voteAsGood) {
    this.voteAsGood = voteAsGood;
  }

  @Override
  public String toString() {
    return "SolutionVoteInput{" + "solutionId='" + solutionId + "'," +"voteAsGood='" + voteAsGood + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolutionVoteInput that = (SolutionVoteInput) o;
        return java.util.Objects.equals(solutionId, that.solutionId) &&
                            voteAsGood == that.voteAsGood;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(solutionId, voteAsGood);
  }

  public static SolutionVoteInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String solutionId;

    private boolean voteAsGood;

    public SolutionVoteInput build() {
                  SolutionVoteInput result = new SolutionVoteInput();
                      result.solutionId = this.solutionId;
          result.voteAsGood = this.voteAsGood;
                      return result;
    }

    public SolutionVoteInput.Builder solutionId(
        String solutionId) {
      this.solutionId = solutionId;
      return this;
    }

    public SolutionVoteInput.Builder voteAsGood(
        boolean voteAsGood) {
      this.voteAsGood = voteAsGood;
      return this;
    }
  }
}
