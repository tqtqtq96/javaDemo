package jsu.ljt.javademo.model.ch11.e03;

// 产品类，包含产品ID和名称
public class Product implements Comparable<Product> {
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

  // 按照产品ID进行比较
  @Override
  public int compareTo(Product other) {
    return this.productId.compareTo(other.productId);
  }
}

