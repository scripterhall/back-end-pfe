package com.ms.invitationservice.keys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class InvitationPK implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chef_projet_id")
    private Long chefProjetId; 
    
}
