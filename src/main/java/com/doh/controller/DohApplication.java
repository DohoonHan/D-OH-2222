package com.doh.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.doh.mappers")
public class DohApplication {
	public static void main(String[] args) {
		SpringApplication.run(DohApplication.class, args);
	}
}
