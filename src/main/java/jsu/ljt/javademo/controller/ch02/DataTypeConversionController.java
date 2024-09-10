package jsu.ljt.javademo.controller.ch02;


import jsu.ljt.javademo.model.ch02.DataTypeConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTypeConversionController {

  @GetMapping("/convert")
  public String convert(
      @RequestParam("input") String input,
      @RequestParam("fromType") String fromType,
      @RequestParam("toType") String toType) {
    return DataTypeConversion.convert(input, fromType, toType);
  }
}

