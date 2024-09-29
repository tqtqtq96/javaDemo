package jsu.ljt.javademo.controller.ch07;

import jsu.ljt.javademo.pojo.ch07.CreditCardPayment;
import jsu.ljt.javademo.pojo.ch07.Payment;
import jsu.ljt.javademo.pojo.ch07.WeChatPayment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaymentController {
  private List<Payment> payments = new ArrayList<>();

  // 创建支付请求
  @PostMapping("/createPayment")
  public String createPayment(@RequestParam String type, @RequestParam String paymentId, @RequestParam double amount, @RequestParam String id) {
    Payment payment;
    if ("credit".equalsIgnoreCase(type)) {
      payment = new CreditCardPayment(paymentId, amount, id);
    } else if ("wechat".equalsIgnoreCase(type)) {
      payment = new WeChatPayment(paymentId, amount, id);
    } else {
      return "未知的支付类型!";
    }
    payments.add(payment);
    return payment.processPayment();
  }

  // 获取所有支付的总金额
  @GetMapping("/totalPayments")
  public double getTotalPayments() {
    return Payment.calculateTotalPayments(payments);
  }

  // 获取所有支付记录
  @GetMapping("/payments")
  public List<Payment> getPayments() {
    return payments;
  }
}
