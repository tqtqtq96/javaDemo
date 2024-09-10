package jsu.ljt.javademo.controller.ch04;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

  @PostMapping("/processGrades")
  public String processGrades(@RequestParam String data) {
    String[] rows = data.split(";");
    StringBuilder result = new StringBuilder();

    for (String row : rows) {
      String[] fields = row.split(",");
      String studentId = fields[0].trim();
      String studentName = fields[1].trim();
      int[] grades = new int[fields.length - 2];
      int sum = 0;

      for (int i = 2; i < fields.length; i++) {
        grades[i - 2] = Integer.parseInt(fields[i].trim());
        sum += grades[i - 2];
      }

      double average = (double) sum / grades.length;
      result.append("学号: ").append(studentId).append(", 姓名: ").append(studentName)
          .append(" - 总成绩: ").append(sum).append(", 平均成绩: ").append(average).append("<br>");
    }

    return result.toString();
  }
}

