package com.ms.sprintbacklogservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductBacklog extends Backlog{

    private Long id; //L'identifiant du product backlog
    private Date dateCreation; //La date de création du product backlog
    
}
