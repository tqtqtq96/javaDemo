package jsu.ljt.javademo.pojo.ch08.e02;

// 产品类，表示一个产品
public class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "产品名称: " + name + ", 价格: " + price;
  }
}

