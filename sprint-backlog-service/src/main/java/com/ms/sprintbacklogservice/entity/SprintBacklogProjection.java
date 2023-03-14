package com.ms.sprintbacklogservice.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullSprintBacklog",types=SprintBacklog.class)
public interface SprintBacklogProjection {
     public Long getId() ; 
     public int getNbrHeurs(); 
     public Long getSprintId();
}
