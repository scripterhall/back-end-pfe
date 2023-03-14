package com.ms.gestionSprints.gestionsprintsservice.repositories;

import com.ms.gestionSprints.gestionsprintsservice.entities.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SprintRepository extends JpaRepository<Sprint, Long> {
    public List<Sprint> findAllByProductBacklogId(Long id);
}
