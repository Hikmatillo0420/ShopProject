package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.OrganizationDTO;
import org.najot.magazinproject.service.impl.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organization")
public class OrganizationCon {
    @Autowired
    private OrganizationServiceImpl service;
    @GetMapping("/{id}")
    OrganizationDTO getOrganizationById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<OrganizationDTO> getAllOrganization(){
       return service.getAll();
    }
    @PostMapping()
    OrganizationDTO createOrganization(@RequestBody OrganizationDTO dto){
        return service.create(dto);
    }
    @PutMapping()
    OrganizationDTO updateOrganization(@PathVariable Long id,@RequestBody OrganizationDTO dto){
        return service.update(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteOrganization(@PathVariable Long id){
        service.deleteById(id);
    }
}
