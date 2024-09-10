package jsu.ljt.javademo.controller.ch04;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

  @PostMapping("/processArray")
  public String processArray(@RequestParam String numbers) {
    String[] numberStrings = numbers.split(",");
    int[] numberArray = new int[numberStrings.length];
    int sum = 0;

    for (int i = 0; i < numberStrings.length; i++) {
      numberArray[i] = Integer.parseInt(numberStrings[i].trim());
      sum += numberArray[i];
    }

    double average = (double) sum / numberArray.length;

    return "总和: " + sum + ", 平均值: " + average;
  }
}

