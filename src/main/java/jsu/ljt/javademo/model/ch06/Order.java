package jsu.ljt.javademo.model.ch06;

public class Order {
  private String productName;
  private int quantity;
  private double price;

  public Order() {}

  public Order(String productName, int quantity, double price) {
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double calculateTotal() {
    return this.price * this.quantity;
  }

  @Override
  public String toString() {
    return "Order{" +
        "productName='" + productName + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        '}';
  }
}

