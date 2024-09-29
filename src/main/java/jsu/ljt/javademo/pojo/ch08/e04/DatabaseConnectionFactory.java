package jsu.ljt.javademo.pojo.ch08.e04;

// 数据库连接工厂类，使用简单工厂模式创建数据库连接
public class DatabaseConnectionFactory {
  public static DatabaseConnection createConnection(String type) {
    if ("mysql".equalsIgnoreCase(type)) {
      return new MySQLConnection();
    } else if ("postgresql".equalsIgnoreCase(type)) {
      return new PostgreSQLConnection();
    }
    return null;
  }
}

