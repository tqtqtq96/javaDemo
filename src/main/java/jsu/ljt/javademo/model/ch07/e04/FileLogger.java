package jsu.ljt.javademo.model.ch07.e04;

import java.io.FileWriter;
import java.io.IOException;

// 文件日志记录器实现日志记录接口
public class FileLogger implements Logger {
  private String fileName;

  public FileLogger(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void log(String message) {
    try (FileWriter writer = new FileWriter(fileName, true)) {
      writer.write(message + "\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

