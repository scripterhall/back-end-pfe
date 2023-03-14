package com.ms.gestionProductBacklog.gestionproductbacklog.controllers;

import com.ms.gestionProductBacklog.gestionproductbacklog.entities.ProductBacklog;
import com.ms.gestionProductBacklog.gestionproductbacklog.services.ProductBacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/product-backlogs")
public class ProductBacklogController {
    @Autowired
    private ProductBacklogService productBacklogService;

    @GetMapping("/{id}")
    public ProductBacklog getProductBacklogById(@PathVariable(name="id") Long id){
        try {
            return this.productBacklogService.getProductBacklogById(id);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null ;
    }

    @GetMapping
    public List<ProductBacklog> getAllProductBacklogs(){
        try {
            return this.productBacklogService.getAllProductBacklogs();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
