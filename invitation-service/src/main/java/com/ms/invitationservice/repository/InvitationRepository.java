package com.ms.invitationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.invitationservice.entity.Invitation;
import com.ms.invitationservice.keys.InvitationPK;

public interface InvitationRepository extends JpaRepository<Invitation,InvitationPK> {
    
}
