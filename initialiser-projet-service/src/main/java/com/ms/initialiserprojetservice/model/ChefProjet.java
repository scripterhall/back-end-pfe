package com.ms.initialiserprojetservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChefProjet {
    
    private Long id ; 
    private String nom ;
    private String adresse; 
    private String telephone; 
    private String email ; 
    private String pwd ;
    private boolean competanceAnalyseDonnees;
    private boolean competanceDeGestion;



}
