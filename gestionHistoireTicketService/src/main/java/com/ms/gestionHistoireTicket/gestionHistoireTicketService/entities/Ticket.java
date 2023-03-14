package com.ms.gestionHistoireTicket.gestionHistoireTicketService.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Ticket {
    private String title; //Le titre du ticket
    private String description; //La description du ticket
}
