package com.ms.invitationservice.entity;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.ms.invitationservice.keys.InvitationPK;
import com.ms.invitationservice.model.ChefProjet;
import com.ms.invitationservice.model.Membre;

import jakarta.persistence.Column;
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
public class Invitation {

    @EmbeddedId
    private InvitationPK pk;

    // private Long chefProjetId; //identfiant chef projet
    
    @Column(nullable = true,name = "membre_id")
    private Long membreId; //identfiant membre peut etre null si le membre est non existant

    @Transient
    private Membre membre;
    
    @Transient
    private ChefProjet chefProjet; 
    

    @Column(nullable = true, unique = true)
    private String emailInvitee;// peut etre null si le membre existe dans la base
    
    
    @OneToOne(mappedBy = "invitation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Role role;

 


    
}
