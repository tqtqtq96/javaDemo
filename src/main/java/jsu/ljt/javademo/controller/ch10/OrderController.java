package jsu.ljt.javademo.controller.ch10;

import jsu.ljt.javademo.model.ch10.Order;
import jsu.ljt.javademo.model.ch10.OrderProcessingException;
import jsu.ljt.javademo.service.ch10.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("ch10OrderController")
@RequestMapping("/ch10")
public class OrderController {

  @Autowired
  private OrderService orderService;

  // 创建并处理订单
  @PostMapping("/processOrder")
  public String processOrder(@RequestParam String orderId, @RequestParam double amount) {
    Order order = new Order(orderId, amount);
    try {
      orderService.processOrder(order);
      return "订单处理成功！订单ID: " + order.getOrderId();
    } catch (OrderProcessingException e) {
      return "错误: " + e.getMessage();
    }
  }
}

