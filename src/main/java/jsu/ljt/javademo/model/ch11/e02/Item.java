package jsu.ljt.javademo.model.ch11.e02;

// 物品类，包含物品ID和名称
public class Item {
  private String itemId;
  private String name;

  public Item(String itemId, String name) {
    this.itemId = itemId;
    this.name = name;
  }

  public String getItemId() {
    return itemId;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "物品ID: " + itemId + ", 名称: " + name;
  }
}

