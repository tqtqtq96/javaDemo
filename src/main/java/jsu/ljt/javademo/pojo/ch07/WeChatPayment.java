package jsu.ljt.javademo.pojo.ch07;

// 具体类表示微信支付
public class WeChatPayment extends Payment {
  private String weChatId;

  public WeChatPayment(String paymentId, double amount, String weChatId) {
    super(paymentId, amount);
    this.weChatId = weChatId;
  }

  @Override
  public String processPayment() {
    return "处理了金额为 " + amount + " 的微信支付，微信ID " + weChatId;
  }
}
