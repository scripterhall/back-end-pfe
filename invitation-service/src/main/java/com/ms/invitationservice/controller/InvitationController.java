package com.ms.invitationservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.invitationservice.entity.Invitation;
import com.ms.invitationservice.keys.InvitationPK;
import com.ms.invitationservice.model.ChefProjet;
import com.ms.invitationservice.model.Membre;
import com.ms.invitationservice.service.ChefProjetFeignClient;
import com.ms.invitationservice.service.InvitationService;
import com.ms.invitationservice.service.MembreFeignClient;

@RestController
@RequestMapping("/invitations")
public class InvitationController {
    
    @Autowired
    private InvitationService invitationService;


    @Autowired
    private MembreFeignClient membreFeignClient;

    @Autowired
    private ChefProjetFeignClient chefProjetFeignClient ;

    @PostMapping
    public Invitation sauvegarderInvitation(Invitation inv) {
        ChefProjet chp = chefProjetFeignClient.getChefProjetsById(inv.getPk().getChefProjetId());
        Membre membre = membreFeignClient.getMembreById(inv.getMembreId());
        inv.setChefProjet(chp);
        inv.setMembre(membre);
        return invitationService.sauvegarderInvitation(inv);
    }

    @GetMapping("/{id}")
    public Invitation getInvitationById(@PathVariable("id") InvitationPK pk) {
        Invitation inv = invitationService.getInvitationById(pk);
        ChefProjet chp = chefProjetFeignClient.getChefProjetsById(inv.getPk().getChefProjetId());
        Membre membre = membreFeignClient.getMembreById(inv.getMembreId());
        inv.setChefProjet(chp);
        inv.setMembre(membre);
        return inv;
    }

    @DeleteMapping("/{id}")
    public void supprimerInvitaion(@PathVariable("id") InvitationPK pk) {
        invitationService.supprimerInvitaion(pk);
    }

    @GetMapping
    public List<Invitation> getAllInvitations() {
        return invitationService.getAllInvitations();
    }


}
