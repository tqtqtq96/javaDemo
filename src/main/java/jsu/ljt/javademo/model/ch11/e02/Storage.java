package jsu.ljt.javademo.model.ch11.e02;

// 泛型接口，用于定义存储行为
public interface Storage<T> {
  void addItem(T item);
  T getItem(String id);
}

