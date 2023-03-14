package com.ms.tickettacheservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Membre {
    private Long  id; 
    private String nom ; 
    private String prenom ; 
    private String adresse ; 
    private String telephone; 
    private String email ; 
    private String pwd; 
    private MembreStatus status; 
    private Date dateInscription; 

}
