package jsu.ljt.javademo.controller.ch03;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoopController {

  @PostMapping("/generateSequence")
  public String generateSequence(@RequestParam int number, @RequestParam String loopType) {
    if ("for".equalsIgnoreCase(loopType)) {
      return generateSequenceWithFor(number);
    } else if ("while".equalsIgnoreCase(loopType)) {
      return generateSequenceWithWhile(number);
    } else {
      return "无效的循环类型";
    }
  }

  private String generateSequenceWithFor(int number) {
    StringBuilder sequence = new StringBuilder();
    for (int i = 1; i <= number; i++) {
      sequence.append(i).append(" ");
    }
    return sequence.toString().trim();
  }

  private static String generateSequenceWithWhile(int number) {
    StringBuilder sequence = new StringBuilder();
    int i = 1;
    while (i <= number) {
      sequence.append(i).append(" ");
      i++;
    }
    return sequence.toString().trim();
  }

  public static void main(String[] args) {
    System.out.println(generateSequenceWithWhile(5));
  }
}

