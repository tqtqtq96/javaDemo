package jsu.ljt.javademo.model.ch10;

// 自定义异常类，用于处理订单处理中的各种异常情况
public class OrderProcessingException extends Exception {
  public OrderProcessingException(String message) {
    super(message);
  }
}

