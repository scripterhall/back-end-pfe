package com.ms.gestionSprints.gestionsprintsservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductBacklog {
    private int nbrTicket;
    private int velocite;
    private Long id;
    private Date dateCreation;

}
