package com.ms.gestionchefProjetservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ms.gestionchefProjetservice.entity.ChefProjet;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionChefProjetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionChefProjetServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RepositoryRestConfiguration configuration ){
		return args ->{
				configuration.exposeIdsFor(ChefProjet.class);
		};
	}

}
