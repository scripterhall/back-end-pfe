package com.ms.gestionSprints.gestionsprintsservice.controllers;

import com.ms.gestionSprints.gestionsprintsservice.entities.ProductBacklog;
import com.ms.gestionSprints.gestionsprintsservice.entities.Sprint;
import com.ms.gestionSprints.gestionsprintsservice.repositories.SprintRepository;
import com.ms.gestionSprints.gestionsprintsservice.services.ProductBacklogService;
import com.ms.gestionSprints.gestionsprintsservice.services.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/sprints")
public class SprintController {
    @Autowired
    private SprintService sprintService;
    @Autowired
    private ProductBacklogService productBacklogService;
    @Autowired
    private SprintRepository sprintRepository;
    @GetMapping
    public List<Sprint> getAllSprints() {
        return sprintService.findAllSprints();
    }
    @GetMapping("/productBacklog/{id}")
    public List<Sprint> getSprintsByProductBacklog(@PathVariable(name="id") Long id) throws SQLException {

        ProductBacklog productBacklog  = this.productBacklogService.findProductBacklogById(id);
        List<Sprint> sprints = this.sprintService.findAllSprintsByProductBacklog(id);
        for(Sprint sprint:sprints){
            sprint.setProductBacklog(productBacklog);
        }
        return sprints;
    }

    @PostMapping
    public ResponseEntity<Sprint> createSprint(@RequestBody Sprint sprint, @RequestParam Long productBacklogId) {
        sprint.setProductBacklogId(productBacklogId);
        sprint.setVelocite(0);
        sprint.setEtat("En attente");
        Sprint createdSprint = sprintService.createSprint(sprint);
        return new ResponseEntity<>(createdSprint, HttpStatus.CREATED);
    }
}