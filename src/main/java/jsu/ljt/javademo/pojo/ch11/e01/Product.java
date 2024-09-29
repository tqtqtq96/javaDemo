package jsu.ljt.javademo.pojo.ch11.e01;

// 产品类，包含产品ID和名称
public class Product {
  private String productId;
  private String name;

  public Product(String productId, String name) {
    this.productId = productId;
    this.name = name;
  }

  public String getProductId() {
    return productId;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "产品ID: " + productId + ", 名称: " + name;
  }
}

