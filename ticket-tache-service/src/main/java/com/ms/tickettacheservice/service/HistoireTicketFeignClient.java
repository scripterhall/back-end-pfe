package com.ms.tickettacheservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.tickettacheservice.model.HistoireTicket;

@FeignClient(name="gestion-histoire-ticket")
public interface HistoireTicketFeignClient {
    
    @GetMapping("/histoireTickets/{id}")
    public HistoireTicket getHistoireTicketById(@PathVariable("id") Long id);

}
