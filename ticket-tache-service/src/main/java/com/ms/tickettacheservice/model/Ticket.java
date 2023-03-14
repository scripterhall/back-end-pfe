package com.ms.tickettacheservice.model;

import jakarta.persistence.Column;
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
public class Ticket {

    @Column(unique = true)
    private String title; //Le titre du ticket
    private String description; //La description du ticket
    
}
