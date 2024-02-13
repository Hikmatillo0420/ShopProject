package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.OrganizationDTO;
import org.najot.magazinproject.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organization")
public class OrganizationCon {
    @Autowired
    private OrganizationService service;
    @GetMapping("/{id}")
    OrganizationDTO getOrganizationById(@PathVariable Long id){
        return service.getOrganizationById(id);
    }
    @GetMapping()
    List<OrganizationDTO> getAllOrganization(){
       return service.getAllOrganization();
    }
    @PostMapping()
    OrganizationDTO createOrganization(@RequestBody OrganizationDTO dto){
        return service.createOrganization(dto);
    }
    @PutMapping()
    OrganizationDTO updateOrganization(@PathVariable Long id,@RequestBody OrganizationDTO dto){
        return service.updateOrganization(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteOrganization(@PathVariable Long id){
        service.deleteOrganizationById(id);
    }
}
