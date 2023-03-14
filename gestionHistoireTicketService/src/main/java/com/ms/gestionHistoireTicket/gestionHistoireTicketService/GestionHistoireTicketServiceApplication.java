package com.ms.gestionHistoireTicket.gestionHistoireTicketService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionHistoireTicketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHistoireTicketServiceApplication.class, args);
	}

}
