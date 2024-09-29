package jsu.ljt.javademo.controller.ch08;


import jsu.ljt.javademo.pojo.ch08.e01.Course;
import jsu.ljt.javademo.pojo.ch08.e01.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

  private List<Course> courses = new ArrayList<>();

  // 添加课程
  @PostMapping("/addCourse")
  public String addCourse(@RequestParam String courseName) {
    Course course = new Course(courseName);
    courses.add(course);
    return "课程添加成功！";
  }

  // 添加学生到课程
  @PostMapping("/addStudent")
  public String addStudent(@RequestParam String courseName, @RequestParam String studentName, @RequestParam int studentAge) {
    for (Course course : courses) {
      if (course.getCourseName().equals(courseName)) {
        Student student = new Student(studentName, studentAge);
        course.addStudent(student);
        return "学生添加成功！";
      }
    }
    return "课程未找到！";
  }

  // 获取所有课程
  @GetMapping("/courses")
  public List<Course> getCourses() {
    return courses;
  }

  // 获取课程的学生
  @GetMapping("/courseStudents")
  public List<Student> getCourseStudents(@RequestParam String courseName) {
    for (Course course : courses) {
      if (course.getCourseName().equals(courseName)) {
        return course.getStudents();
      }
    }
    return new ArrayList<>();
  }
}

