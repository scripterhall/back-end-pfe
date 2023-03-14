package com.ms.tickettacheservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SprintBacklog {
    
    private Long id ; 
    private int nbrHeurs; 
    private int velocite; 
    private Long sprintId;
}
