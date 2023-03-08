package com.ms.gestionchefProjetservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="chef_de_projet")
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class ChefProjet extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//identifiant de chef de projet 
    @Column(name="competance_analyse_donnees")
    private boolean competanceAnalyseDonnees;//confirmation de niveau sur quelle point
    @Column(name="competance_de_gestion")
    private boolean competanceDeGestion;//confirmation de niveau
}
