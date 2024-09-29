package jsu.ljt.javademo.service.Impl;

import jsu.ljt.javademo.Mapper.UserMapper;
import jsu.ljt.javademo.pojo.User;
import jsu.ljt.javademo.pojo.UserDTO;
import jsu.ljt.javademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    public User login(UserDTO user) {
        String username = user.getUsername();
        String password = user.getPassword();
        User user1 = userMapper.login(username, password);
        if (user1 == null) {
            System.out.println("登录失败！");
            return null;
        }
        System.out.println("登录成功！");
        return user1;
    }

    public void register(UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        userMapper.register(username, password);
    }
}
