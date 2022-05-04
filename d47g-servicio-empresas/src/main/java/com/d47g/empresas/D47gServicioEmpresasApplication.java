package com.d47g.empresas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.d47g.comunes.models.entity",
	"com.d47g.empresas.models.entity"})
public class D47gServicioEmpresasApplication {

	public static void main(String[] args) {
		SpringApplication.run(D47gServicioEmpresasApplication.class, args);
	}

}
