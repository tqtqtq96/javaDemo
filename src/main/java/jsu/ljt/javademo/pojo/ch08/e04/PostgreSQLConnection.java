package jsu.ljt.javademo.pojo.ch08.e04;

// PostgreSQL连接类，实现数据库连接接口
public class PostgreSQLConnection implements DatabaseConnection {
  @Override
  public String connect() {
    return "连接到PostgreSQL数据库";
  }
}

