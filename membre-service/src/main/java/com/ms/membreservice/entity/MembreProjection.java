package com.ms.membreservice.entity;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name ="fullMembre", types = Membre.class)
public interface MembreProjection {
    
    public Long getId();
    public String getNom();
    public String getPrenom();
    public String getAdresse();
    public String getTelephone(); 
    public String getEmail();
    public String getUsername();
    public Date getDateInscription();
    public MembreStatus getStatus();

}
