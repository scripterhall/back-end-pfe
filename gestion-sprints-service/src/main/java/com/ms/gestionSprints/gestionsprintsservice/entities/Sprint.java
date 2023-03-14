package com.ms.gestionSprints.gestionsprintsservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="sprint")
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateLancement;
    private Date dateFin;
    private String objectif;
    private int velocite;
    private String etat;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long productBacklogId;
    @Transient
    private ProductBacklog productBacklog;
}
