package com.ms.tickettacheservice.entity;

import java.util.Date;

import com.ms.tickettacheservice.model.HistoireTicket;
import com.ms.tickettacheservice.model.Membre;
import com.ms.tickettacheservice.model.SprintBacklog;
import com.ms.tickettacheservice.model.Ticket;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ticket_tache")
public class TicketTache extends Ticket {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 

    @Column(name="nbr_heurs")
    private int nbHeurs;

    @Column(name="membre_id")
    private Long membreId;

    @Column(name="date_lancement")
    private Date dateLancement;

    @Column(name="date_fin")
    private Date dateFin;

    @Column(name="sprint_backlog_id")
    private Long sprintBacklogId;

    @Column(name="ticket_histoire_id")
    private Long ticketHistoryId;

    @Transient
    private Membre membre; 

    @Transient
    private HistoireTicket ht; 

    @Transient
    private SprintBacklog sprintBacklog;
    
}
