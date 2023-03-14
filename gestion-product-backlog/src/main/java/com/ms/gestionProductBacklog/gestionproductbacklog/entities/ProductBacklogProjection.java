package com.ms.gestionProductBacklog.gestionproductbacklog.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullProductBacklog",types=ProductBacklog.class)

public interface ProductBacklogProjection {
    public Long getId();
    public Date getDateCreation();
    public int getNbrTickets();
    public int velocite();
}
