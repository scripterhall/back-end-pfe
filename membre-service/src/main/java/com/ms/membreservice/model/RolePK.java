package com.ms.membreservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RolePK implements Serializable{
    
    
    private Long membreId;
    
    private Long projetId;
}
