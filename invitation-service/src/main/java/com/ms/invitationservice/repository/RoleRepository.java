package com.ms.invitationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.invitationservice.entity.Role;
import com.ms.invitationservice.keys.RolePK;

public interface RoleRepository extends JpaRepository<Role,RolePK> {
    
}
