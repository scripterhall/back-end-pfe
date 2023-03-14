package com.ms.gestionProductBacklog.gestionproductbacklog.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="product_backlog")
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class ProductBacklog extends Backlog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //L'identifiant du product backlog
    private Date dateCreation; //La date de création du product backlog
}
