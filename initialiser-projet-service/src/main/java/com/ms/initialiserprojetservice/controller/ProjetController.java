package com.ms.initialiserprojetservice.controller;

import java.sql.SQLException;
import java.util.List;
import com.ms.initialiserprojetservice.model.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.initialiserprojetservice.service.ChefProjetClientService;
import com.ms.initialiserprojetservice.service.ProjetService;
import com.ms.initialiserprojetservice.model.ChefProjet;

@RestController
@RequestMapping("/projets")
public class ProjetController {
    
    @Autowired
    private ProjetService projetService;


    @Autowired
    private ChefProjetClientService chefProjetClientService;

    @GetMapping
    public List<Projet> getAllProjet() {
        return projetService.findAllProjet();
    }

    @GetMapping("/chefProjets/{id}")
    public List<Projet> getProjetsByChefProjet(@PathVariable(name="id") Long id) throws SQLException{
        
        ChefProjet chef  = this.chefProjetClientService.findChefProjetsById(id);
        List<Projet> projets = this.projetService.findAllProjetByChef(id);
        for(Projet projet:projets){
            projet.setChefProjet(chef);
        }
        return projets;
    }

    @PostMapping
    public Projet ajouterProjet(@RequestBody Projet p){
        return this.projetService.save(p);
    }
    
    
    
    
}
