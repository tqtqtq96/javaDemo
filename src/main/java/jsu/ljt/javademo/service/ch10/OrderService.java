package jsu.ljt.javademo.service.ch10;

import jsu.ljt.javademo.model.ch10.Order;
import jsu.ljt.javademo.model.ch10.OrderProcessingException;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  // 处理订单的方法，声明可能抛出OrderProcessingException
  public void processOrder(Order order) throws OrderProcessingException {
    if (order.getAmount() <= 0) {
      throw new OrderProcessingException("订单金额必须大于零！");
    }
    // 订单处理逻辑
    System.out.println("订单处理成功，订单ID: " + order.getOrderId());
  }
}

