package com.ms.membreservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ms.membreservice.entity.Membre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Invitation {

    private InvitationPK pk;

    // private Long chefProjetId; //identfiant chef projet
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long membreId; //identfiant membre peut etre null si le membre est non existant
  
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Membre membre;
    
    private ChefProjet chefProjet; 
    

    
    private String emailInvitee;// peut etre null si le membre existe dans la base
    

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Role role;

 


    
}
