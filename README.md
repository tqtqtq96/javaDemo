# javaDemo

仔细阅读以下内容，可以一起学习，点点小星星，谢谢啦，不喜欢白嫖怪，如果白嫖怪太多，就不开源了

### 项目简介

`javaDemo` 是一个基于 Spring Boot 的 Java 项目，旨在演示 Java 的 Web 应用程序开发。该项目使用了 Spring Boot 3.3.2 版本，并集成了常用的依赖和工具来实现简化的开发流程。

### 技术栈

- **Spring Boot 3.3.2**: 提供快速构建和部署 Spring 应用程序的框架。
- **Java 17**: 项目的主要编程语言。
- **Lombok**: 通过注解简化 Java 对象的编写，减少样板代码。
- **SLF4J**: 提供统一的日志记录 API。
- **Apache Commons JEXL**: 用于表达式语言的解析和执行。
- **JUnit**: 用于单元测试。

### 依赖

#### 核心依赖
- `spring-boot-starter-web`: 用于构建 Web 应用程序，提供 REST API 功能。
- `spring-boot-starter-test`: 包含 JUnit、Mockito 等测试框架。
- `lombok`: 通过注解减少样板代码，如 `@Getter`, `@Setter`, `@ToString` 等。
- `slf4j-api`: 提供日志记录的接口，便于项目中的日志管理。
- `commons-jexl3`: Apache Commons JEXL，Java 表达式语言，支持简单的脚本处理。

### 构建和运行

#### 环境要求
- **JDK 17** 或更高版本  (本人使用的是**JDK 22**）
- **Maven 3.8+** （本人maven版本 **3.9.6**）
- **仅供参考，勿喷，谢谢欸（比心）**

#### 构建项目 

在命令行中进入项目根目录，并运行以下命令：

```bash
mvn clean install
```
#### 点个小星星啦，谢谢咯
