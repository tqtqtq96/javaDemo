package jsu.ljt.javademo.controller.ch05;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceCalculatorController2 {

  @PostMapping("/calculatePrice2")
  public String calculatePrice(@RequestParam double price, @RequestParam(required = false) String... params) {
    Integer quantity = null;
    Double discount = null;
    Boolean isMember = null;

    // 解析可变参数
    for (String param : params) {
      System.out.println("param: " + param);  // 添加调试信息
      String[] keyValue = param.split("=");
      if (keyValue.length == 2) {
        String key = keyValue[0];
        String value = keyValue[1];
        switch (key) {
          case "quantity":
            quantity = Integer.parseInt(value);
            break;
          case "discount":
            discount = Double.parseDouble(value);
            break;
          case "isMember":
            isMember = Boolean.parseBoolean(value);
            break;
        }
      }
    }
    return "最终价格: " + calculatePrice(price, quantity, discount, isMember);
  }

  /**
   * 形参长度可变的方法处理所有情况
   * @param price 商品的单价
   * @param quantity 商品数量
   * @param discount 折扣率
   * @param isMember 是否为会员
   * @return 计算后的最终价格
   */
  private double calculatePrice(double price, Integer quantity, Double discount, Boolean isMember) {
    double finalPrice = price;

    if (quantity != null) {
      finalPrice *= quantity;
    }

    if (discount != null) {
      finalPrice *= (1 - discount / 100);
    }

    if (isMember != null && isMember) {
      finalPrice *= 0.9; // 会员折扣 10%
    }

    return finalPrice;
  }
}
