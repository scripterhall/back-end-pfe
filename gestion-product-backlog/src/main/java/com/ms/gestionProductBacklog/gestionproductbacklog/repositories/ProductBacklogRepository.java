package com.ms.gestionProductBacklog.gestionproductbacklog.repositories;

import com.ms.gestionProductBacklog.gestionproductbacklog.entities.ProductBacklog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBacklogRepository extends JpaRepository<ProductBacklog,Long> {
}
