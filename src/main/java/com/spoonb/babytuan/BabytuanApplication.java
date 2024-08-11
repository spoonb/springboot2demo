package com.spoonb.babytuan;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spoonb.babytuan")
public class BabytuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabytuanApplication.class, args);
	}

}
