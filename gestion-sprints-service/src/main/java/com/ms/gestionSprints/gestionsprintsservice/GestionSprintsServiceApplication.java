package com.ms.gestionSprints.gestionsprintsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionSprintsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionSprintsServiceApplication.class, args);
	}

}
