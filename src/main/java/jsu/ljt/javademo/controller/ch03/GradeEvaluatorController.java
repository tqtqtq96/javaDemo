package jsu.ljt.javademo.controller.ch03;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeEvaluatorController {
  @PostMapping("/evaluateGrade")
  public String evaluateGrade(@RequestParam double score) {
    return evaluateGradeWithIfElse(score);
  }

  // 使用if-else结构判断等级
  private String evaluateGradeWithIfElse(double score) {
    if (score >= 90 && score <= 100) {
      return "优秀";
    } else if (score >= 80 && score < 90) {
      return "良好";
    } else if (score >= 70 && score < 80) {
      return "中等";
    } else if (score >= 60 && score < 70) {
      return "及格";
    } else if (score >= 0 && score < 60) {
      return "不及格";
    } else {
      return "无效的分数";
    }
  }
  // 使用switch-case结构判断等级
  private String evaluateGradeWithSwitch(int score) {
    if (score < 0 || score > 100) {
      return "无效的分数";
    }

    switch (score / 10) {
      case 10:
      case 9:
        return "优秀";
      case 8:
        return "良好";
      case 7:
        return "中等";
      case 6:
        return "及格";
      default:
        return "不及格";
    }
  }
}
