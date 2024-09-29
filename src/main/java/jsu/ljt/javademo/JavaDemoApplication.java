package jsu.ljt.javademo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jsu.ljt.javademo.Mapper")
public class JavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDemoApplication.class, args);
	}

}
