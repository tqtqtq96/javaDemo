package jsu.ljt.javademo.controller.ch08;

import jsu.ljt.javademo.pojo.ch08.ConfigurationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ch08")
public class ConfigurationController {

  // 获取配置
  @GetMapping("/getConfig")
  public String getConfig() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    return "当前配置: " + configManager.getConfig();
  }

  // 设置配置
  @PostMapping("/setConfig")
  public String setConfig(@RequestParam String config) {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    configManager.setConfig(config);
    return "配置更新成功！当前配置: " + configManager.getConfig();
  }
}

