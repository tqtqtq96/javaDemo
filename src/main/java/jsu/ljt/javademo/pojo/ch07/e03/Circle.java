package jsu.ljt.javademo.pojo.ch07.e03;

// 圆形类实现图形接口
public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle with radius: " + radius);
  }
}

