package com.ms.gestionSprints.gestionsprintsservice.services;

import com.ms.gestionSprints.gestionsprintsservice.entities.Sprint;
import com.ms.gestionSprints.gestionsprintsservice.repositories.SprintRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintService {
    private static final Logger logger = LogManager.getLogger(SprintService.class);
    @Autowired
    private SprintRepository sprintRepository;
    public List<Sprint> findAllSprintsByProductBacklog(Long id){
        return this.sprintRepository.findAllByProductBacklogId(id);
    }
    public List<Sprint> findAllSprints(){
        return this.sprintRepository.findAll();
    }
    public Sprint createSprint(Sprint sprint) {
        return sprintRepository.save(sprint);
    }
}
