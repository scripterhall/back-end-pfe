package com.ms.gestionchefProjetservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.gestionchefProjetservice.entity.ChefProjet;

public interface ChefProjetRepository extends JpaRepository<ChefProjet,Long> {
    
}
