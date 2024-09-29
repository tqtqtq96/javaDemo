package jsu.ljt.javademo.Mapper;

import jsu.ljt.javademo.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    // 方法定义

    // 登录
    @Select("select * from users where username = #{username} and password = #{password}")
    User login(String username, String password);

    // 注册
    @Select("insert into users(username, password) values(#{username}, #{password})")
    void register(String username, String password);
}
