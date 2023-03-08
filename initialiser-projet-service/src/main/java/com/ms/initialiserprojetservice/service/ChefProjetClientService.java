package com.ms.initialiserprojetservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.initialiserprojetservice.model.ChefProjet;


@FeignClient(name="gestion-chefProjet-service")
public interface ChefProjetClientService {
    
    @GetMapping("/chef-projets/{id}?projection=fullDetails")
    public ChefProjet findChefProjetsById(@PathVariable("id") Long id);


}
