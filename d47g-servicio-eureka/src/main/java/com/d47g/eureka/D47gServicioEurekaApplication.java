package com.d47g.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class D47gServicioEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(D47gServicioEurekaApplication.class, args);
	}

}
