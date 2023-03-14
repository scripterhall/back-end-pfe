package com.ms.membreservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InvitationPK implements Serializable{

    
    private Long id;
    
    private Long chefProjetId; 
    
}
