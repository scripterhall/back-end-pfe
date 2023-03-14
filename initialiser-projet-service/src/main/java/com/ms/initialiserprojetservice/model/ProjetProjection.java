package com.ms.initialiserprojetservice.model;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProjet",types = Projet.class)
public interface ProjetProjection {

    public Long getId();
    public String getNom();
    public Date getDateDebut();
    public Date getDateFin();
    public ChefProjet getChefProjet();
    
}
