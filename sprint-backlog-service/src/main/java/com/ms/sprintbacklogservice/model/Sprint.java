package com.ms.sprintbacklogservice.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Sprint {
    
    private Long id ; 
    private Date dateLancement ;
    private Date dateFin ; 
    private String objectif;
    private int velocite;
    private String etat;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long productBacklogId;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long membreId;
    private Membre membre ;
    private ProductBacklog productBacklog;
}
