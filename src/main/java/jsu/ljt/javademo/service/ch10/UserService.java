package jsu.ljt.javademo.service.ch10;

import jsu.ljt.javademo.model.ch10.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

// 用户服务类，提供用户的添加和登录功能
@Service("userServicech10")
public class UserService {
  private Map<String, User> users = new HashMap<>();

  // 添加用户
  public void addUser(String username, String password) throws Exception {
    if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
      throw new Exception("用户名或密码不能为空！");
    }
    if (users.containsKey(username)) {
      throw new Exception("用户名已存在！");
    }
    users.put(username, new User(username, password));
  }

  // 用户登录
  public User login(String username, String password) throws Exception {
    if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
      throw new Exception("用户名或密码不能为空！");
    }
    if (!users.containsKey(username)) {
      throw new Exception("用户不存在！");
    }
    User user = users.get(username);
    if (!user.getPassword().equals(password)) {
      throw new Exception("密码错误！");
    }
    return user;
  }
}

