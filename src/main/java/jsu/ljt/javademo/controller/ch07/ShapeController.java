package jsu.ljt.javademo.controller.ch07;

import jsu.ljt.javademo.model.ch07.e03.Circle;
import jsu.ljt.javademo.model.ch07.e03.Rectangle;
import jsu.ljt.javademo.model.ch07.e03.Shape;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShapeController {
  private List<Shape> shapes = new ArrayList<>();

  @PostMapping("/addShape")
  public String addShape(@RequestParam String type, @RequestParam double... dimensions) {
    Shape shape;
    if (type.equals("circle")) {
      shape = new Circle(dimensions[0]);
    } else if (type.equals("rectangle")) {
      shape = new Rectangle(dimensions[0], dimensions[1]);
    } else {
      return "无效的图形类型!";
    }
    shapes.add(shape);
    shape.draw();
    return "图形添加成功,图形面积："+shape.calculateArea();
  }

  @GetMapping("/totalArea")
  public double getTotalArea() {
    double totalArea = 0;
    for (Shape shape : shapes) {
      totalArea += shape.calculateArea();
    }
    return totalArea;
  }
}

