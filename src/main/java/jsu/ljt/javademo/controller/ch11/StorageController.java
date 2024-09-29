package jsu.ljt.javademo.controller.ch11;

import jsu.ljt.javademo.model.ch11.e02.Item;
import jsu.ljt.javademo.model.ch11.e02.ItemStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ch11")
public class StorageController {

  private ItemStorage itemStorage = new ItemStorage();

  // 添加物品到存储
  @PostMapping("/addItem")
  public String addItem(@RequestParam String itemId, @RequestParam String name) {
    Item item = new Item(itemId, name);
    itemStorage.addItem(item);
    return "物品添加成功！";
  }

  // 获取物品
  @GetMapping("/getItem")
  public Item getItem(@RequestParam String itemId) {
    return itemStorage.getItem(itemId);
  }

  // 获取所有存储的物品
  @GetMapping("/getAllItems")
  public Map<String, Item> getAllItems() {
    return itemStorage.getAllItems();
  }
}

