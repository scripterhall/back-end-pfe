package com.ms.sprintbacklogservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.sprintbacklogservice.model.Sprint;

@FeignClient(name="gestion-sprints-service")
public interface SprintFeignClient {

    @GetMapping("/sprints/{id}")
    public Sprint getSprintById(@PathVariable("id") Long id);

    
}
