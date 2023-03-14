package com.ms.membreservice.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ms.membreservice.repository.MembreRepository;
import com.ms.membreservice.entity.Membre;

@Service
public class MembreService {
    

    @Autowired
    private MembreRepository membreRepository;


    public Membre findMembreById(Long id) throws SQLException{
        return this.membreRepository.findById(id).get();
    }


    public List<Membre> findAllMembres() throws SQLException{
        return this.membreRepository.findAll();
    }

}
