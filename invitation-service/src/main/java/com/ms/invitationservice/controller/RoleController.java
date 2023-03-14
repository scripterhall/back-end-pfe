package com.ms.invitationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.invitationservice.entity.Role;
import com.ms.invitationservice.keys.RolePK;
import com.ms.invitationservice.model.Membre;
import com.ms.invitationservice.model.Projet;
import com.ms.invitationservice.service.MembreFeignClient;
import com.ms.invitationservice.service.ProjetFeignClient;
import com.ms.invitationservice.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
    
    @Autowired
    private RoleService roleService;

    @Autowired
    private ProjetFeignClient projetClient ;

    @Autowired
    private MembreFeignClient membreClient ;

    @PostMapping
    public Role sauvegarderInvitation(Role role) {
        Projet projet = projetClient.getProjetById(role.getPk().getProjetId());
        Membre membre = membreClient.getMembreById(role.getPk().getMembreId());
        role.setProjet(projet);
        role.setMembre(membre);
        return roleService.sauvegarderRole(role);
    }

    @GetMapping("/{id}")
    public Role getInvitationById(@PathVariable("id") RolePK pk) {
        Projet projet = projetClient.getProjetById(pk.getProjetId());
        Membre membre = membreClient.getMembreById(pk.getMembreId());
        Role r =  roleService.getRoleById(pk);
        r.setMembre(membre);
        r.setProjet(projet);
        return r;
    }


    @DeleteMapping("/{id}")
    public void supprimerInvitaion(@PathVariable("id") RolePK pk) {
        roleService.supprimerRole(pk);
    }

    
}
