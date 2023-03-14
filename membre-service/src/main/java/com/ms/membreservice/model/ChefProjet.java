package com.ms.membreservice.model;

import com.ms.membreservice.entity.Personne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class ChefProjet extends Personne {

    private Long id;
    private boolean competanceAnalyseDonnees;//confirmation de niveau sur quelle point
    private boolean competanceDeGestion;//confirmation de niveau
    
}
