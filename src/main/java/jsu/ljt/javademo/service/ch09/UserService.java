package jsu.ljt.javademo.service.ch09;

import jsu.ljt.javademo.model.ch09.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// 用户服务类，提供用户的添加和获取功能
@Service
public class UserService {
  private List<User> users = new ArrayList<>();

  public UserService() {
    // 初始化一些用户
    users.add(new User("张三", 25, "password123", "zhangsan@example.com"));
    users.add(new User("李四", 30, "password456", "lisi@example.com"));
  }

  // 添加用户
  public void addUser(User user) {
    users.add(user);
  }

  // 获取所有用户
  public List<User> getAllUsers() {
    return users;
  }
}

