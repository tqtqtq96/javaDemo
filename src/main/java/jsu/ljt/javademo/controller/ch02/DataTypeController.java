package jsu.ljt.javademo.controller.ch02;

import jsu.ljt.javademo.pojo.ch02.DataTypeExample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTypeController {

  @GetMapping("/data-types")
  public DataTypeExample getDataTypes() {
    return new DataTypeExample();
  }
}

