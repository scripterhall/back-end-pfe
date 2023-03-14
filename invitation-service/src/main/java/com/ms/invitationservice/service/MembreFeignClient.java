package com.ms.invitationservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.invitationservice.model.Membre;

@FeignClient(name = "membre-service")
public interface MembreFeignClient {

    @GetMapping("/membres/{id}?projection=fullMembre")
    public Membre getMembreById(@PathVariable Long id) ;
    
}
