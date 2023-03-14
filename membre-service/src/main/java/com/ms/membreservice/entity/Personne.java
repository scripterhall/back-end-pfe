package com.ms.membreservice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@ToString
public class Personne {
    
    private String nom ;//nom d'un personne
    private String prenom; //prenom d'un personne
    private String adresse ;//adresse d'un personne
    private String telephone ; //telephone d'un personne
    private String email ;//email d'un personne
    @Column(name="password")
    private String pwd ;//password d'un personne
    @Column(name="date_inscription")
    private Date dateInscription ;//date inscription d'un personne
    @Column(unique = true)
    private String username;//le nom d'utilisateur 
}
