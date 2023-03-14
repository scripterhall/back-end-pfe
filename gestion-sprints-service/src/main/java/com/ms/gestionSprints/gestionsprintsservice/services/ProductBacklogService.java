package com.ms.gestionSprints.gestionsprintsservice.services;

import com.ms.gestionSprints.gestionsprintsservice.entities.ProductBacklog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="gestion-product-backlog")
public interface ProductBacklogService {
    @GetMapping("/product-backlogs/{id}?projection=fullProductBacklog")
    public ProductBacklog findProductBacklogById(@PathVariable("id") Long id);
}
