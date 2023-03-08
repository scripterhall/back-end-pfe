package com.ms.gestionchefProjetservice.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.gestionchefProjetservice.entity.ChefProjet;
import com.ms.gestionchefProjetservice.repository.ChefProjetRepository;
@Service
public class ChefProjetService {
    
    @Autowired
    private ChefProjetRepository chefProjetRepository; 

    
    public ChefProjet getChefProjetById(Long id) throws SQLException{
        return  chefProjetRepository.findById(id).get();
    }

    public List<ChefProjet> getAllChefProjet()throws SQLException{
        return chefProjetRepository.findAll();
    }


}
