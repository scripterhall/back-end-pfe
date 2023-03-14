package com.ms.sprintbacklogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.sprintbacklogservice.entity.SprintBacklog;
import com.ms.sprintbacklogservice.model.Sprint;
import com.ms.sprintbacklogservice.service.SprintBacklogService;
import com.ms.sprintbacklogservice.service.SprintFeignClient;

@RestController
@RequestMapping("/sprint-backlogs")
public class SprintBacklogController {
    
    @Autowired
    private SprintBacklogService sprintBacklogService;

    @Autowired
    private SprintFeignClient sprintFeignClient;


    @GetMapping("/{id}")
    public SprintBacklog getSprintBacklog(@PathVariable("id") Long id) {
       
        SprintBacklog spb =  sprintBacklogService.getSprintBacklog(id);
        Sprint sprint = this.sprintFeignClient.getSprintById(spb.getSprintId());
        spb.setSprint(sprint);
        return spb;
    }

    @PostMapping
    public SprintBacklog ajouterSprintBacklog(@RequestBody SprintBacklog sBacklog) {
        return sprintBacklogService.ajouterSprintBacklog(sBacklog);
    }

    @DeleteMapping("/{id}")
    public void supprimerSprintBacklog(@PathVariable("id") Long id) {
        sprintBacklogService.supprimerSprintBacklog(id);
    }


    @GetMapping("/sprint/{id-sprint}")
    public SprintBacklog getSprintBacklogBySprint(@PathVariable("id-sprint") Long idSprint) {
        SprintBacklog spb = sprintBacklogService.getSprintBacklogBySprint(idSprint);
        Sprint sprint = this.sprintFeignClient.getSprintById(spb.getSprintId());
        spb.setSprint(sprint);
        return spb;
    }


   

}
