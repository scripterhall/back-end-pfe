package com.ms.invitationservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.invitationservice.model.ChefProjet;

@FeignClient(name="gestion-chefProjet-service")
public interface ChefProjetFeignClient {

    @GetMapping("/chef-projets/{id}?projection=fullDetails")
    public ChefProjet getChefProjetsById(@PathVariable Long id);
    
}
