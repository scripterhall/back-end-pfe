package com.ms.gestionProductBacklog.gestionproductbacklog.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Backlog {
    
    private int velocite; //La vélocité

}
