package com.example.Productservicec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceC2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceC2Application.class, args);
	}

}
