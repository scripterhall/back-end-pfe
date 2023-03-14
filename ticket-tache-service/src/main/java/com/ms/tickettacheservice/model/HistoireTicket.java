package com.ms.tickettacheservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class HistoireTicket extends Ticket{
    
    private Long id;
    private String priorite;
    private Date dateDeb;
    private Date dateFin;
    private int effort;
    private Long productBacklogId;
    private int position;
}
