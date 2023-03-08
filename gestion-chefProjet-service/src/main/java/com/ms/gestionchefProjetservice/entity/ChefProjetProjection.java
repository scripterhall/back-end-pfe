package com.ms.gestionchefProjetservice.entity;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullDetails",types=ChefProjet.class)
public interface ChefProjetProjection {
    //interface pour exposer les attribut pour les autre micro service
    public Long getId();
    public String getNom();
    public String getPrenom();
    public String getAdresse();
    public String getTelephone(); 
    public String getEmail();
    public String getUsername();
    public Date getDateInscription();

}
