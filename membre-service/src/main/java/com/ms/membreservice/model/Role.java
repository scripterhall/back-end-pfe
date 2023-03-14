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
public class Role {
    

    private RolePK pk;
    private String type;
    private String permission ; 
    private String description  ;

  
    private Projet projet ;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Membre membre ;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Invitation invitation ;



}
