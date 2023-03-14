package com.ms.invitationservice.keys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePK implements Serializable{
    
    @Column(name = "membre_id")
    private Long membreId;
    @Column(name = "projet_id")
    private Long projetId;
}
