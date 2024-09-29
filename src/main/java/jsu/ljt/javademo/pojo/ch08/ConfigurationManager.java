package jsu.ljt.javademo.pojo.ch08;

// 配置管理器类，使用单例模式
public class ConfigurationManager {
  private static ConfigurationManager instance;
  private String config;

  // 私有构造函数，防止外部实例化
  private ConfigurationManager() {
    config = "默认配置";
  }

  // 获取单例实例的方法
  public static synchronized ConfigurationManager getInstance() {
    if (instance == null) {
      instance = new ConfigurationManager();
    }
    return instance;
  }

  // 获取配置
  public String getConfig() {
    return config;
  }

  // 设置配置
  public void setConfig(String config) {
    this.config = config;
  }
}

