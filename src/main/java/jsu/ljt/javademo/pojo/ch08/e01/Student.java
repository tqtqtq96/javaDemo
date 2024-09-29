package jsu.ljt.javademo.pojo.ch08.e01;

// 学生类，表示一个学生
public class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "学生姓名: " + name + ", 年龄: " + age;
  }
}

