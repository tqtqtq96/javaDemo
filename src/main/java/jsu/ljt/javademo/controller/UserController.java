package jsu.ljt.javademo.controller;

import jsu.ljt.javademo.Common.Result;
import jsu.ljt.javademo.pojo.User;
import jsu.ljt.javademo.pojo.UserDTO;
import jsu.ljt.javademo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<User> login(@ModelAttribute UserDTO userDTO) {
        log.info("登录: {}", userDTO);
        User user = userService.login(userDTO);
        return Result.success(user);
    }


    @PostMapping("/register")
    public Result<User> register(@ModelAttribute UserDTO userDTO) {
        log.info("注册: {}", userDTO);
        userService.register(userDTO);
        return Result.success();
    }
}
