package com.ms.gestionProductBacklog.gestionproductbacklog;

import com.ms.gestionProductBacklog.gestionproductbacklog.entities.ProductBacklog;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionProductBacklogApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProductBacklogApplication.class, args);
	}
	@Bean
	CommandLineRunner start(RepositoryRestConfiguration configuration ){
		return args ->{
			configuration.exposeIdsFor(ProductBacklog.class);
		};
	}
}
