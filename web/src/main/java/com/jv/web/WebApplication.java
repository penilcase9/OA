package com.jv.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ComponentScan : 把需要用到的模块也进行扫描，否则会出现类找不到问题
 * https://blog.csdn.net/qq_31615049/article/details/84641985
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.jv.web","com.jv.sysmanager","com.jv.base","com.jv.common"})
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
