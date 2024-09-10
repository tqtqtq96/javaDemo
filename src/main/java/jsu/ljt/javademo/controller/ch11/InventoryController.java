package jsu.ljt.javademo.controller.ch11;

import jsu.ljt.javademo.model.ch11.e01.Electronics;
import jsu.ljt.javademo.model.ch11.e01.Inventory;
import jsu.ljt.javademo.model.ch11.e01.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("ch11InventoryController")
@RequestMapping("/ch11")
public class InventoryController {

  private Inventory<Product> inventory = new Inventory<>();

  // 添加产品到库存
  @PostMapping("/addProduct")
  public String addProduct(@RequestParam String productId, @RequestParam String name, @RequestParam(required = false) String brand) {
    if (brand != null) {
      inventory.addItem(new Electronics(productId, name, brand));
    } else {
      inventory.addItem(new Product(productId, name));
    }
    return "产品添加成功！";
  }

  // 获取所有库存产品
  @GetMapping("/getInventory")
  public List<Product> getInventory() {
    return inventory.getItems();
  }

  // 打印库存信息
  @GetMapping("/printInventory")
  public String printInventory() {
    Inventory.printInventory(inventory);
    return "库存信息已打印到控制台！";
  }
}

