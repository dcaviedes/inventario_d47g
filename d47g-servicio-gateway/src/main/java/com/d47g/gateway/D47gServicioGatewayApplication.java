package com.d47g.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class D47gServicioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(D47gServicioGatewayApplication.class, args);
	}

}
