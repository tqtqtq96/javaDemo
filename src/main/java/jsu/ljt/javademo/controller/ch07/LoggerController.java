package jsu.ljt.javademo.controller.ch07;

import jsu.ljt.javademo.model.ch07.e04.ConsoleLogger;
import jsu.ljt.javademo.model.ch07.e04.FileLogger;
import jsu.ljt.javademo.model.ch07.e04.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoggerController {

  private List<Logger> loggers = new ArrayList<>();

  // 添加日志记录器
  @PostMapping("/addLogger")
  public String addLogger(@RequestParam String type, @RequestParam(required = false) String fileName) {
    Logger logger;
    if ("file".equalsIgnoreCase(type)) {
      logger = new FileLogger(fileName);
    } else if ("console".equalsIgnoreCase(type)) {
      logger = new ConsoleLogger();
    } else if ("anonymous".equalsIgnoreCase(type)) {
      // 使用匿名内部类
      logger = new Logger() {
        @Override
        public void log(String message) {
          System.out.println("匿名内部类日志: " + message);
        }
      };
    } else if ("lambda".equalsIgnoreCase(type)) {
      // 使用Lambda表达式
      logger = message -> System.out.println("Lambda日志: " + message);
    } else {
      return "无效的日志记录器类型!";
    }
    loggers.add(logger);
    return "日志记录器添加成功！";
  }

  // 记录日志
  @PostMapping("/log")
  public String logMessage(@RequestParam String message) {
    for (Logger logger : loggers) {
      logger.log(message);
    }
    return "日志记录成功！";
  }
}

