package com.ms.gestionHistoireTicket.gestionHistoireTicketService.services;

import com.ms.gestionHistoireTicket.gestionHistoireTicketService.entities.HistoireTicket;
import com.ms.gestionHistoireTicket.gestionHistoireTicketService.repositories.HistoireTicketRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoireTicketService {
    private static final Logger logger = LogManager.getLogger(HistoireTicketService.class);
    @Autowired
    private HistoireTicketRepository histoireTicketRepository;
    public List<HistoireTicket> findAllHistoireTicketByProductBacklog(Long id){
        return this.histoireTicketRepository.findAllByProductBacklogId(id);
    }
    public List<HistoireTicket> findAllHistoireTickets(){
        return this.histoireTicketRepository.findAll();
    }
    public HistoireTicket addHistoireTicket(HistoireTicket histoireTicket) {
        return histoireTicketRepository.save(histoireTicket);
    }
}
