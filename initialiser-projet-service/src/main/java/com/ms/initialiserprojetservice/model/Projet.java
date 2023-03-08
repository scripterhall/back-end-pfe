package com.ms.initialiserprojetservice.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //identifiant de projet
    private String nom; //nom de projet
    private String cles; //abvreva de projet
    private Date dateDebut; //date debut de projet

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long chefProjetId;//liaison avec le chef de projet qui a creer le projet

    @Transient
    private ChefProjet chefProjet;//chaque projet est gere par un chef de projet

    
    private Date dateFin; //date fin de projet estimé

    
}
