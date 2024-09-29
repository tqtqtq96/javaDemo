package jsu.ljt.javademo.controller.ch02;

import jsu.ljt.javademo.pojo.ch02.ExpressionEvaluator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpressionStatementController {

  @GetMapping("/evaluate")
  public String evaluate(@RequestParam("input") String input) {
    return ExpressionEvaluator.evaluate(input);
  }
}

