package com.ms.sprintbacklogservice.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public class Backlog {
    
    private int velocite; 

}
