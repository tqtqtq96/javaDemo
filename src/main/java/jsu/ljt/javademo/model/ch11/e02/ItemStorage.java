package jsu.ljt.javademo.model.ch11.e02;

import java.util.HashMap;
import java.util.Map;

// 物品存储类，实现泛型接口Storage
public class ItemStorage implements Storage<Item> {
  private Map<String, Item> storage = new HashMap<>();

  @Override
  public void addItem(Item item) {
    storage.put(item.getItemId(), item);
  }

  @Override
  public Item getItem(String id) {
    return storage.get(id);
  }

  // 获取所有存储的物品
  public Map<String, Item> getAllItems() {
    return storage;
  }
}

