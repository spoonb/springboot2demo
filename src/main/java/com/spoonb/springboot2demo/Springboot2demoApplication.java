package com.spoonb.springboot2demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spoonb.springboot2demo")
public class Springboot2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2demoApplication.class, args);
	}

}
