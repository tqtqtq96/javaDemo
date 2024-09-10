package jsu.ljt.javademo.controller.ch05;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceCalculatorController {

  @PostMapping("/calculatePrice")
  public String calculatePrice(@RequestParam double price, @RequestParam(required = false) Integer quantity,
                               @RequestParam(required = false) Double discount, @RequestParam(required = false) String isMember) {
    if (quantity != null && discount != null && isMember != null) {
      return "最终价格: " + calculatePrice(price, quantity, discount, Boolean.parseBoolean(isMember));
    } else if (quantity != null && discount != null) {
      return "最终价格: " + calculatePrice(price, quantity, discount);
    } else if (quantity != null) {
      return "最终价格: " + calculatePrice(price, quantity);
    } else {
      return "最终价格: " + calculatePrice(price);
    }
  }

  // 仅计算单个商品价格
  private double calculatePrice(double price) {
    return price;
  }

  // 根据数量计算总价格
  private double calculatePrice(double price, int quantity) {
    return price * quantity;
  }

  // 根据数量和折扣计算总价格
  private double calculatePrice(double price, int quantity, double discount) {
    return price * quantity * (1 - discount / 100);
  }

  // 根据数量、折扣和会员身份计算总价格
  private double calculatePrice(double price, int quantity, double discount, boolean isMember) {
    double memberDiscount = isMember ? 0.9 : 1.0; // 10% 会员折扣
    return price * quantity * (1 - discount / 100) * memberDiscount;
  }
}
