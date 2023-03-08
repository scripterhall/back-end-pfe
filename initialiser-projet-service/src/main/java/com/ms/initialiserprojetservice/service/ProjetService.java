package com.ms.initialiserprojetservice.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ms.initialiserprojetservice.model.Projet;
import com.ms.initialiserprojetservice.repository.ProjetRepository;



@Service
public class ProjetService {
    
    private static final Logger logger = LogManager.getLogger(ProjetService.class);
    
    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> findAllProjetByChef(Long id){
        return this.projetRepository.findAllByChefProjetId(id);
    }

    public List<Projet> findAllProjet(){
        return this.projetRepository.findAll();
    }

    public Projet save(Projet p){
        try {
            return this.projetRepository.save(p);
        } catch (DataAccessException ex) {
            // Gérer l'exception ici
            logger.error("Erreur de base de données: ".concat(ex.getMessage()));
            return null;
        }
    }


}
