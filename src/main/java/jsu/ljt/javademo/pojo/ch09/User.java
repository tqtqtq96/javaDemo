package jsu.ljt.javademo.pojo.ch09;

// 用户类，包含用户的基本信息
public class User {
  // 公共字段，所有人都可以访问
  public String name;

  // 受保护字段，只有同一个包中的类和子类可以访问
  protected int age;

  // 私有字段，只有User类内部可以访问
  private String password;

  // 默认访问权限的字段，只有同一个包中的类可以访问
  String email;

  // 公共构造函数
  public User(String name, int age, String password, String email) {
    this.name = name;
    this.age = age;
    this.password = password;
    this.email = email;
  }

  // 公共方法，获取用户信息
  public String getUserInfo() {
    return "用户名: " + name + ", 年龄: " + age + ", 邮箱: " + email;
  }

  // 私有方法，获取用户密码
  private String getPassword() {
    return password;
  }

  // 受保护的方法，获取用户年龄
  protected int getAge() {
    return age;
  }

  // 默认访问权限的方法，获取用户邮箱
  String getEmail() {
    return email;
  }
}

