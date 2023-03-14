package com.ms.membreservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.membreservice.entity.Membre;

public interface MembreRepository extends JpaRepository<Membre,Long> {
    
}
