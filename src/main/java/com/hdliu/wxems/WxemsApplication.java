package com.hdliu.wxems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hdliu.wxems.dao")
public class WxemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxemsApplication.class, args);
	}
}
