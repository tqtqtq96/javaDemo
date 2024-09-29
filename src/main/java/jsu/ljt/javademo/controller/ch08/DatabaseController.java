package jsu.ljt.javademo.controller.ch08;

import jsu.ljt.javademo.model.ch08.e04.DatabaseConnection;
import jsu.ljt.javademo.model.ch08.e04.DatabaseConnectionFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("Ch08DatabaseController")
@RequestMapping("/ch08")
public class DatabaseController {

  // 创建数据库连接并返回连接信息
  @PostMapping("/connect")
  public String connect(@RequestParam String type) {
    DatabaseConnection connection = DatabaseConnectionFactory.createConnection(type);
    if (connection != null) {
      return "连接成功！" + connection.connect();
    } else {
      return "无效的数据库类型！";
    }
  }
}

