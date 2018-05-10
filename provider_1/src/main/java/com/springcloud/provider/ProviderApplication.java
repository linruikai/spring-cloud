package com.springcloud.provider;

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
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

	@Value("${server.port}")
	private String port;
	private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);
	@GetMapping("/login")
	public String login(){
		logger.info("我是服务提供方  {}",port);
		return "我是服务提供方  "+port;
	}
}
