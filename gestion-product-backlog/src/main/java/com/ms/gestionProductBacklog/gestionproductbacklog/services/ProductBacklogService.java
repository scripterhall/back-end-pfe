package com.ms.gestionProductBacklog.gestionproductbacklog.services;

import com.ms.gestionProductBacklog.gestionproductbacklog.entities.ProductBacklog;
import com.ms.gestionProductBacklog.gestionproductbacklog.repositories.ProductBacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductBacklogService {
    @Autowired
    private ProductBacklogRepository productBacklogRepository;

    public List<ProductBacklog> getAllProductBacklogs()throws SQLException{
        return productBacklogRepository.findAll();
    }
    public ProductBacklog getProductBacklogById(Long id) throws SQLException {
        return productBacklogRepository.findById(id).get();
    }
}
