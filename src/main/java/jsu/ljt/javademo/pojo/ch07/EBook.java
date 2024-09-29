package jsu.ljt.javademo.pojo.ch07;

public class EBook extends Book {
  private double fileSize; // 文件大小，单位MB

  public EBook(String title, String author, double price, double fileSize) {
    super(title, author, price);
    this.fileSize = fileSize;
  }

  public double getFileSize() {
    return fileSize;
  }

  @Override
  public String toString() {
    return "EBook{" +
        "title='" + getTitle() + '\'' +
        ", author='" + getAuthor() + '\'' +
        ", price=" + getPrice() +
        ", fileSize=" + fileSize +
        " MB}";
  }
}

