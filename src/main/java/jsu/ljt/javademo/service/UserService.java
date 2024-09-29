package jsu.ljt.javademo.service;

import jsu.ljt.javademo.pojo.User;
import jsu.ljt.javademo.pojo.UserDTO;

public interface UserService {

    User login(UserDTO user);

    void register(UserDTO userDTO);
}
