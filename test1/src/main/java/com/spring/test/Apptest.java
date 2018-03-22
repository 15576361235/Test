package com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Apptest {

	public static void main(String[] args) {
		
		SpringApplication.run(Apptest.class, args);
		System.out.println("1111111111");
		System.out.println("22222");
		System.out.println("333333");
	}

}
