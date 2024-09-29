package jsu.ljt.javademo.controller.ch09;

import jsu.ljt.javademo.model.ch09.User;
import jsu.ljt.javademo.service.ch09.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("Ch09UserController")
@RequestMapping("/ch09")
public class UserController {

  @Autowired
  private UserService userService;

  // 获取所有用户信息
  @GetMapping("/users")
  public List<String> getAllUsers() {
    List<User> users = userService.getAllUsers();
    return users.stream().map(User::getUserInfo).toList();
  }

  // 添加用户
  @PostMapping("/users")
  public String addUser(@RequestParam String name, @RequestParam int age, @RequestParam String password, @RequestParam String email) {
    userService.addUser(new User(name, age, password, email));
    return "用户添加成功！";
  }
}

