package jsu.ljt.javademo.controller.ch10;

import jsu.ljt.javademo.model.ch10.User;
import jsu.ljt.javademo.service.ch10.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("ch10UserController")
@RequestMapping("/ch10")
public class UserController {

  @Autowired
  private UserService userService;

  // 添加用户
  @PostMapping("/addUser")
  public String addUser(@RequestParam String username, @RequestParam String password) {
    try {
      userService.addUser(username, password);
      return "用户添加成功！";
    } catch (Exception e) {
      return "错误: " + e.getMessage();
    } finally {
      System.out.println("用户添加操作完成");
    }
  }

  // 用户登录
  @PostMapping("/login")
  public String login(@RequestParam String username, @RequestParam String password) {
    try {
      User user = userService.login(username, password);
      return "登录成功！欢迎，" + user.getUsername() + "！";
    } catch (Exception e) {
      return "错误: " + e.getMessage();
    } finally {
      System.out.println("用户登录操作完成");
    }
  }
}

