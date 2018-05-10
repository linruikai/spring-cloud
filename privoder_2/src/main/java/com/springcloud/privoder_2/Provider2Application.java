package com.springcloud.privoder_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Provider2Application {

	public static void main(String[] args) {
		SpringApplication.run(Provider2Application.class, args);
	}

	@Value("${server.port}")
	private String port;
	private static final Logger logger = LoggerFactory.getLogger(Provider2Application.class);
	@GetMapping("/login")
	public String login(){
		logger.info("我是服务提供方  {}",port);
		return "我是服务提供方  "+port;
	}
}
