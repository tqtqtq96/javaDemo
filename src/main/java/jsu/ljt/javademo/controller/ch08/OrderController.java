package jsu.ljt.javademo.controller.ch08;

import jsu.ljt.javademo.pojo.ch08.e02.Order;
import jsu.ljt.javademo.pojo.ch08.e02.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("ch08OrderController")
@RequestMapping("/ch08")
public class OrderController {

  private List<Order> orders = new ArrayList<>();

  // 添加订单
  @PostMapping("/addOrder")
  public String addOrder(@RequestParam String orderId) {
    Order order = new Order(orderId);
    orders.add(order);
    return "订单添加成功！";
  }

  // 添加产品到订单
  @PostMapping("/addProduct")
  public String addProduct(@RequestParam String orderId, @RequestParam String productName, @RequestParam double productPrice) {
    for (Order order : orders) {
      if (order.getOrderId().equals(orderId)) {
        Product product = new Product(productName, productPrice);
        order.addProduct(product);
        return "产品添加成功！";
      }
    }
    return "订单未找到！";
  }

  // 获取所有订单
  @GetMapping("/orders")
  public List<Order> getOrders() {
    return orders;
  }

  // 获取订单的产品
  @GetMapping("/orderProducts")
  public List<Product> getOrderProducts(@RequestParam String orderId) {
    for (Order order : orders) {
      if (order.getOrderId().equals(orderId)) {
        return order.getProducts();
      }
    }
    return new ArrayList<>();
  }
}

