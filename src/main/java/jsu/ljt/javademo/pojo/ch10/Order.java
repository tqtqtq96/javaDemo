package jsu.ljt.javademo.pojo.ch10;

// 订单类，包含订单ID和金额
public class Order {
  private String orderId;
  private double amount;

  public Order(String orderId, double amount) {
    this.orderId = orderId;
    this.amount = amount;
  }

  public String getOrderId() {
    return orderId;
  }

  public double getAmount() {
    return amount;
  }
}

