package com.ms.tickettacheservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.tickettacheservice.entity.TicketTache;
import com.ms.tickettacheservice.model.Membre;
import com.ms.tickettacheservice.repository.TicketTacheRepository;

@Service
public class TicketTacheService {
    
    @Autowired
    private TicketTacheRepository ticketTacheRepository;


    public TicketTache ajouterTicketTache(TicketTache tt){
        if(this.ticketTacheRepository.findByTitle(tt.getTitle())==null)
            return this.ticketTacheRepository.save(tt);
        return null;
    } 

    public TicketTache getTicketTacheById(Long id){
        return this.ticketTacheRepository.findById(id).get();
    }

    public TicketTache prendreTicketTache(Membre m,Long id){

        TicketTache tt = this.ticketTacheRepository.findById(id).get();
        tt.setMembreId(m.getId());
        tt.setMembre(m);
        return this.ticketTacheRepository.save(tt); 
    }

    public TicketTache modifierTicketTache(TicketTache tt){
        if(this.ticketTacheRepository.findById(tt.getId())==null)
            return this.ticketTacheRepository.save(tt);
        return null;
    }

    public void supprimerTicketTache(Long id){

        this.ticketTacheRepository.deleteById(id);
    }

    //Possibilter de creation d un corbeille pour les ticket supprimer


}
