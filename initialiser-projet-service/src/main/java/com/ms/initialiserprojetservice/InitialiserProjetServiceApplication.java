package com.ms.initialiserprojetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InitialiserProjetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialiserProjetServiceApplication.class, args);
	}

}
