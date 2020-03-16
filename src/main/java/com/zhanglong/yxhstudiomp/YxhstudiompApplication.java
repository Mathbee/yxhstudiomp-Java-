package com.zhanglong.yxhstudiomp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhanglong.yxhstudiomp.mapper")
public class YxhstudiompApplication {

	public static void main(String[] args) {
		SpringApplication.run(YxhstudiompApplication.class, args);
	}

}
