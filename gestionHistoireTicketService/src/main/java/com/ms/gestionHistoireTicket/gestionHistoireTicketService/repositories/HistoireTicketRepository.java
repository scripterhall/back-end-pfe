package com.ms.gestionHistoireTicket.gestionHistoireTicketService.repositories;

import com.ms.gestionHistoireTicket.gestionHistoireTicketService.entities.HistoireTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoireTicketRepository extends JpaRepository<HistoireTicket, Long> {
    public List<HistoireTicket> findAllByProductBacklogId(Long id);
}
