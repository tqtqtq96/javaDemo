package jsu.ljt.javademo.controller.ch11;

import jsu.ljt.javademo.model.ch11.e03.Product;
import jsu.ljt.javademo.utils.ch11.SortUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController("ch11e03SortController")
@RequestMapping("/ch11/e03")
public class SortController {

  private List<Product> products = new ArrayList<>();

  // 添加产品到列表
  @PostMapping("/addProduct")
  public String addProduct(@RequestParam String productId, @RequestParam String name) {
    Product product = new Product(productId, name);
    products.add(product);
    return "产品添加成功！";
  }

  // 获取按产品ID排序的产品列表
  @GetMapping("/getSortedProducts")
  public List<Product> getSortedProducts() {
    return SortUtils.sortList(products);
  }

  // 获取按名称排序的产品列表
  @GetMapping("/getSortedProductsByName")
  public List<Product> getSortedProductsByName() {
    return SortUtils.sortList(products, Comparator.comparing(Product::getName));
  }
}

