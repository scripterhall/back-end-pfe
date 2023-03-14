package com.ms.invitationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.invitationservice.entity.Role;
import com.ms.invitationservice.keys.RolePK;
import com.ms.invitationservice.repository.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;


    public Role sauvegarderRole(Role role){
        if(roleRepository.findById(role.getPk()).get()!=null)
            return roleRepository.save(role);
        return null;
    }

    public Role getRoleById(RolePK pk){
        return roleRepository.findById(pk).get();
    } 

    public void supprimerRole(RolePK pk){
        if(this.roleRepository.existsById(pk))
            this.roleRepository.deleteById(pk);
    }
    
}
