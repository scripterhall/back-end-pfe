package com.ms.sprintbacklogservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ms.sprintbacklogservice.entity.SprintBacklog;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SprintBacklogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBacklogServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RepositoryRestConfiguration configuration ){
		return args->{
			configuration.exposeIdsFor(SprintBacklog.class);
		};
	}
}
