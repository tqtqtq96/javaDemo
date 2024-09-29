package jsu.ljt.javademo.controller.ch06;


import jsu.ljt.javademo.model.ch06.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @PostMapping("/register")
  public String registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
    // 创建User对象并设置属性
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    user.setEmail(email);

    // 简单的验证逻辑
    if (user.getUsername().isEmpty() || user.getPassword().isEmpty() || user.getEmail().isEmpty()) {
      return "注册失败：所有字段都是必填项。";
    }

    // 返回成功信息
    return "注册成功！ 用户名：" + user.getUsername() + "，电子邮件：" + user.getEmail();
  }
}

