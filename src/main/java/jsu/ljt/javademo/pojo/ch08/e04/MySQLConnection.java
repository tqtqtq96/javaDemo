package jsu.ljt.javademo.pojo.ch08.e04;

// MySQL连接类，实现数据库连接接口
public class MySQLConnection implements DatabaseConnection {
  @Override
  public String connect() {
    return "连接到MySQL数据库";
  }
}

