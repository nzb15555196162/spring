package com.nzb.spring.helloworld.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@RequestMapping("/")
	public String getHello() {
		return "hello";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello spring";
	}

}
