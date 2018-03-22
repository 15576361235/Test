package com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Apptest {

	public static void main(String[] args) {
		System.out.println("111");
		SpringApplication.run(Apptest.class, args);

	}

}
