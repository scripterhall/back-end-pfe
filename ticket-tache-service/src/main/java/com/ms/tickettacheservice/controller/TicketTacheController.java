package com.ms.tickettacheservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.tickettacheservice.entity.TicketTache;
import com.ms.tickettacheservice.model.HistoireTicket;
import com.ms.tickettacheservice.model.Membre;
import com.ms.tickettacheservice.model.SprintBacklog;
import com.ms.tickettacheservice.service.HistoireTicketFeignClient;
import com.ms.tickettacheservice.service.MembreFeignClient;
import com.ms.tickettacheservice.service.SprintBacklogFeignClient;
import com.ms.tickettacheservice.service.TicketTacheService;

@RestController
@RequestMapping("ticket-taches")
public class TicketTacheController {
    
    @Autowired
    private TicketTacheService ticketTacheService;

    @Autowired
    private MembreFeignClient membreClient;

    @Autowired
    HistoireTicketFeignClient histoireTicketFeignClient;

    @Autowired
    SprintBacklogFeignClient sprintBacklogFeignClient;

    @PostMapping
    public TicketTache ajouterTicketTache(TicketTache tt) {
        
        SprintBacklog sprintBacklog = this.sprintBacklogFeignClient.getSprintBacklogById(tt.getSprintBacklogId());
        HistoireTicket ht = this.histoireTicketFeignClient.getHistoireTicketById(tt.getTicketHistoireId());
        TicketTache tt_saved =  ticketTacheService.ajouterTicketTache(tt);
        tt_saved.setHt(ht);
        tt_saved.setSprintBacklog(sprintBacklog);
        return tt_saved;

    }


    @GetMapping("/{id}")
    public TicketTache getTicketTacheById(@PathVariable("id") Long id) {

       TicketTache tt_find =ticketTacheService.getTicketTacheById(id);
       SprintBacklog sprintBacklog = this.sprintBacklogFeignClient.getSprintBacklogById(tt_find.getSprintBacklogId());
       HistoireTicket ht = this.histoireTicketFeignClient.getHistoireTicketById(tt_find.getTicketHistoireId());
       if(tt_find.getMembreId()!=null){
        Membre membre = this.membreClient.getMembreById(tt_find.getMembreId());
        tt_find.setMembre(membre);
      }
      tt_find.setHt(ht);
      tt_find.setSprintBacklog(sprintBacklog);
      return tt_find;
    }

    @PutMapping("/{id-ticket}")
    public TicketTache prendreTicketTache(@RequestBody Membre m,@PathVariable("id-ticket") Long id) {
        return ticketTacheService.prendreTicketTache(m, id);
    }

    @PutMapping
    public TicketTache modifierTicketTache(TicketTache tt) {
        
        SprintBacklog sprintBacklog = this.sprintBacklogFeignClient.getSprintBacklogById(tt.getSprintBacklogId());
        HistoireTicket ht = this.histoireTicketFeignClient.getHistoireTicketById(tt.getTicketHistoireId());
        TicketTache tt_saved =  ticketTacheService.modifierTicketTache(tt);
        if(tt.getMembreId()!=null){
            Membre membre = this.membreClient.getMembreById(tt.getMembreId());
            tt_saved.setMembre(membre);
        }
        tt_saved.setHt(ht);
        tt_saved.setSprintBacklog(sprintBacklog);
        return tt_saved;

    }

    @DeleteMapping("/{id}")
    public void supprimerTicketTache(@PathVariable("id") Long id) {
        ticketTacheService.supprimerTicketTache(id);
    }


    @GetMapping("/ticket-histoire/{id-ticket-histoire}")
    public List<TicketTache> getTicketsTacheByTicketHistoireId(@PathVariable("id-ticket-histoire") Long id){
        List<TicketTache> tts = this.ticketTacheService.getTicketTacheByHistoireTicketId(id);
        for(TicketTache tt:tts){
        //     tt.setSprintBacklog(this.sprintBacklogFeignClient.getSprintBacklogById(tt.getSprintBacklogId()));
        //     if(tt.getMembreId()!=null){
        tt.setHt(histoireTicketFeignClient.getHistoireTicketById(id));        
        //         tt.setMembre(this.membreClient.getMembreById(tt.getMembreId()));
        //     }
        }
        return tts;
    }

    



}
