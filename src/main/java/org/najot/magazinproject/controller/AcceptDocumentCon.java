package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.najot.magazinproject.service.impl.AcceptDocumentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/document")
public class AcceptDocumentCon {
    @Autowired
    private AcceptDocumentServiceImpl service;
    @GetMapping("/{id}")
    AcceptDocumentDTO getDocumentById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<AcceptDocumentDTO> getAllDocument(){
        return service.getAll();
    }

    @PostMapping()
    AcceptDocumentDTO createDocument(@RequestBody AcceptDocumentDTO acceptDocumentDTO){
        return service.create(acceptDocumentDTO);
    }
    @PutMapping("/{id}")
    AcceptDocumentDTO updateDocument(@PathVariable Long id,@RequestBody AcceptDocumentDTO acceptDocumentDTO){
        return service.update(id, acceptDocumentDTO);
    }
    @DeleteMapping("/{id}")
    void deleteDocument(@PathVariable Long id){
         service.deleteById(id);
    }

}
