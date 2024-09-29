package jsu.ljt.javademo.controller.ch06;

import jsu.ljt.javademo.pojo.ch06.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @PostMapping("/createOrder")
  public String createOrder(@RequestBody Order order) {
    // 使用匿名对象创建Order并计算总价
    double total = new Order(order.getProductName(), order.getQuantity(), order.getPrice()) {
      public double getTotal() {
        return this.calculateTotal();
      }
    }.getTotal();

    return "订单创建成功！ 产品名称：" + order.getProductName() + "，数量：" + order.getQuantity() + "，单价：" + order.getPrice() + "，总价：" + total;
  }
}

