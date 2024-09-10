package jsu.ljt.javademo.model.ch07;

import java.util.List;

// 抽象类表示通用支付方式
public abstract class Payment {
  protected String paymentId;
  protected double amount;

  public Payment(String paymentId, double amount) {
    this.paymentId = paymentId;
    this.amount = amount;
  }

  // 抽象方法处理支付，由子类实现
  public abstract String processPayment();

  // 静态方法计算总支付金额
  public static double calculateTotalPayments(List<Payment> payments) {
    double total = 0;
    for (Payment payment : payments) {
      total += payment.amount;
    }
    return total;
  }
}

