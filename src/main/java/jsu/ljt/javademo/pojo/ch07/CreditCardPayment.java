package jsu.ljt.javademo.pojo.ch07;

// 具体类表示信用卡支付
public class CreditCardPayment extends Payment {
  private String cardNumber;

  public CreditCardPayment(String paymentId, double amount, String cardNumber) {
    super(paymentId, amount);
    this.cardNumber = cardNumber;
  }

  @Override
  public String processPayment() {
    return "处理了金额为 " + amount + " 的信用卡支付，卡号 " + cardNumber;
  }
}
