package com.ms.gestionHistoireTicket.gestionHistoireTicketService.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="histoire_ticket")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class HistoireTicket extends Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String priorite;
    private Date dateDeb;
    private Date dateFin;
    private int effort;
    private Long productBacklogId;
    @Transient
    private ProductBacklog productBacklog;
    private int position;

}
