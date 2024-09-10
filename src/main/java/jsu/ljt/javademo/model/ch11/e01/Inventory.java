package jsu.ljt.javademo.model.ch11.e01;

import java.util.ArrayList;
import java.util.List;

// 泛型类，用于管理不同类型的产品
public class Inventory<T> {
  private List<T> items;

  public Inventory() {
    this.items = new ArrayList<>();
  }

  public void addItem(T item) {
    items.add(item);
  }

  public List<T> getItems() {
    return items;
  }

  // 使用通配符打印产品信息
  public static void printInventory(Inventory<? extends Product> inventory) {
    for (Product product : inventory.getItems()) {
      System.out.println(product);
    }
  }
}

