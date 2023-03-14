package com.ms.sprintbacklogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.sprintbacklogservice.entity.SprintBacklog;
import com.ms.sprintbacklogservice.repository.SprintBacklogRepo;

@Service
public class SprintBacklogService {
    

    @Autowired
    private SprintBacklogRepo sprintBacklogRepo;

    public SprintBacklog getSprintBacklog(Long id) {
        if(this.sprintBacklogRepo.existsById(id))
            return this.sprintBacklogRepo.findById(id).get();
        return null;
    }

    public SprintBacklog ajouterSprintBacklog(SprintBacklog sBacklog){
        return this.sprintBacklogRepo.save(sBacklog);
    }

    public void supprimerSprintBacklog(Long id){
        this.sprintBacklogRepo.deleteById(id);
    }

    public SprintBacklog getSprintBacklogBySprint(Long idSprint){
        return this.sprintBacklogRepo.findBySprintId(idSprint);
    }


}
