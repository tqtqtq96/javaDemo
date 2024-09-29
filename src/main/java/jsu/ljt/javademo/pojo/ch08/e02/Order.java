package jsu.ljt.javademo.pojo.ch08.e02;

import java.util.ArrayList;
import java.util.List;

// 订单类，表示一个订单
public class Order {
  private String orderId;
  private List<Product> products;

  public Order(String orderId) {
    this.orderId = orderId;
    this.products = new ArrayList<>();
  }

  public String getOrderId() {
    return orderId;
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public List<Product> getProducts() {
    return products;
  }

  public double calculateTotal() {
    double total = 0;
    for (Product product : products) {
      total += product.getPrice();
    }
    return total;
  }

  @Override
  public String toString() {
    return "订单ID: " + orderId + ", 产品数量: " + products.size();
  }
}

