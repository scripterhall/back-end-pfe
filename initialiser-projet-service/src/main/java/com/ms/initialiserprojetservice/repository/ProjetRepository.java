package com.ms.initialiserprojetservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.initialiserprojetservice.model.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

    public List<Projet> findAllByChefProjetId(Long id);
}
