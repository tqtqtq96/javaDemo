package jsu.ljt.javademo.model.ch07.e04;

// 控制台日志记录器实现日志记录接口
public class ConsoleLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println(message);
  }
}

