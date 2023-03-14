package com.ms.sprintbacklogservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ms.sprintbacklogservice.model.Backlog;
import com.ms.sprintbacklogservice.model.Sprint;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper=false)
public class SprintBacklog extends Backlog{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ; 

    @Column(name="nbr_heurs")
    private int nbrHeurs; 

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long sprintId;

    @Transient
    private Sprint sprint ; 

}
