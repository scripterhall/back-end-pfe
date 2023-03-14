package com.ms.invitationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.invitationservice.entity.Invitation;
import com.ms.invitationservice.keys.InvitationPK;
import com.ms.invitationservice.repository.InvitationRepository;

@Service
public class InvitationService {

    @Autowired
    private InvitationRepository invitationRepository;

    

    public Invitation sauvegarderInvitation(Invitation inv){
        if(invitationRepository.findById(inv.getPk()).get()!=null)
            return invitationRepository.save(inv);
        return null;
    }

    public Invitation getInvitationById(InvitationPK pk){
        return invitationRepository.findById(pk).get();
    } 

    public void supprimerInvitaion(InvitationPK pk){
        if(this.invitationRepository.existsById(pk))
            this.invitationRepository.deleteById(pk);
    }

    public List<Invitation> getAllInvitations(){
        return this.invitationRepository.findAll();
    }
    
}
