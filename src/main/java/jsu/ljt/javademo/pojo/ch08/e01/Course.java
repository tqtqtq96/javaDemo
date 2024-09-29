package jsu.ljt.javademo.pojo.ch08.e01;

import java.util.ArrayList;
import java.util.List;

// 课程类，表示一个课程
public class Course {
  private String courseName;
  private List<Student> students;

  public Course(String courseName) {
    this.courseName = courseName;
    this.students = new ArrayList<>();
  }

  public String getCourseName() {
    return courseName;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public List<Student> getStudents() {
    return students;
  }

  @Override
  public String toString() {
    return "课程名称: " + courseName + ", 学生人数: " + students.size();
  }
}

