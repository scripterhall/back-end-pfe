package com.ms.tickettacheservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.tickettacheservice.model.SprintBacklog;

@FeignClient(name="sprint-backlog-service")
public interface SprintBacklogFeignClient {
    
    @GetMapping("/sprint-backlogs/{id}?projection=fullSprintBacklog")
    public SprintBacklog getSprintBacklogById(@PathVariable("id") Long id);
}
