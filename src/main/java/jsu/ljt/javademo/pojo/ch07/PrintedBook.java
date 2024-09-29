package jsu.ljt.javademo.pojo.ch07;

public class PrintedBook extends Book {
  private double shippingWeight; // 运输重量，单位kg

  public PrintedBook(String title, String author, double price, double shippingWeight) {
    super(title, author, price);
    this.shippingWeight = shippingWeight;
  }

  public double getShippingWeight() {
    return shippingWeight;
  }

  @Override
  public String toString() {
    return "PrintedBook{" +
        "title='" + getTitle() + '\'' +
        ", author='" + getAuthor() + '\'' +
        ", price=" + getPrice() +
        ", shippingWeight=" + shippingWeight +
        " kg}";
  }
}

