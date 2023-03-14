package com.ms.membreservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.membreservice.model.Invitation;

@FeignClient(name = "invitation-service")
public interface InvitationFeignClient {


    @GetMapping("/invitations/{idMembre}")
    public List<Invitation> getInvitationsByMembreId(@PathVariable("idMembre") Long id);
    
}
