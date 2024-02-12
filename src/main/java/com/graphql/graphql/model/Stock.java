package com.graphql.graphql.model;

import java.time.OffsetDateTime;

public class Stock {
  private String symbol;

  private int price;

  private OffsetDateTime lastTradeDateTime;

  public Stock() {
  }

  public Stock(String symbol, int price, OffsetDateTime lastTradeDateTime) {
    this.symbol = symbol;
    this.price = price;
    this.lastTradeDateTime = lastTradeDateTime;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public OffsetDateTime getLastTradeDateTime() {
    return lastTradeDateTime;
  }

  public void setLastTradeDateTime(OffsetDateTime lastTradeDateTime) {
    this.lastTradeDateTime = lastTradeDateTime;
  }

  @Override
  public String toString() {
    return "Stock{" + "symbol='" + symbol + "'," +"price='" + price + "'," +"lastTradeDateTime='" + lastTradeDateTime + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock that = (Stock) o;
        return java.util.Objects.equals(symbol, that.symbol) &&
                            price == that.price &&
                            java.util.Objects.equals(lastTradeDateTime, that.lastTradeDateTime);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(symbol, price, lastTradeDateTime);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String symbol;

    private int price;

    private OffsetDateTime lastTradeDateTime;

    public Stock build() {
                  Stock result = new Stock();
                      result.symbol = this.symbol;
          result.price = this.price;
          result.lastTradeDateTime = this.lastTradeDateTime;
                      return result;
    }

    public Builder symbol(String symbol) {
      this.symbol = symbol;
      return this;
    }

    public Builder price(int price) {
      this.price = price;
      return this;
    }

    public Builder lastTradeDateTime(
        OffsetDateTime lastTradeDateTime) {
      this.lastTradeDateTime = lastTradeDateTime;
      return this;
    }
  }
}
