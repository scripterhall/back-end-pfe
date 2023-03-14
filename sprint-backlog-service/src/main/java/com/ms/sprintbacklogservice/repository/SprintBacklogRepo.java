package com.ms.sprintbacklogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.sprintbacklogservice.entity.SprintBacklog;

public interface SprintBacklogRepo extends JpaRepository<SprintBacklog,Long> {
    
    public SprintBacklog findBySprintId(Long id);
}
