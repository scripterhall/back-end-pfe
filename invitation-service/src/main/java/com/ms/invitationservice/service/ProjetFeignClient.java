package com.ms.invitationservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.invitationservice.model.Projet;

@FeignClient(name = "initialiser-projet-service")
public interface ProjetFeignClient {


    @GetMapping("/projets/{id}?projection=fullProjet")
    public Projet getProjetById(@PathVariable("id") Long id);
    
}
