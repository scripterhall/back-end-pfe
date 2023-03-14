package com.ms.invitationservice.entity;


import com.ms.invitationservice.keys.RolePK;
import com.ms.invitationservice.model.Membre;
import com.ms.invitationservice.model.Projet;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
    
    @EmbeddedId
    private RolePK pk;
    private String type;
    private String permission ; 
    private String description  ;

    @Transient
    private Projet projet ;

    @Transient
    private Membre membre ;


    @OneToOne
    private Invitation invitation ;



}
