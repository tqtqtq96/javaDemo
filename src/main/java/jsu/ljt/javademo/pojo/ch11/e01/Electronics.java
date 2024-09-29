package jsu.ljt.javademo.pojo.ch11.e01;

// 电子产品类，继承自产品类
public class Electronics extends Product {
  private String brand;

  public Electronics(String productId, String name, String brand) {
    super(productId, name);
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  @Override
  public String toString() {
    return super.toString() + ", 品牌: " + brand;
  }
}

