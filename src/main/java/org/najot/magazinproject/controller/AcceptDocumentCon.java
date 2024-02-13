package org.najot.magazinproject.controller;

import lombok.RequiredArgsConstructor;
import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.najot.magazinproject.service.AcceptDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/document")
public class AcceptDocumentCon {
    @Autowired
    private AcceptDocumentService service;
    @GetMapping("/{id}")
    AcceptDocumentDTO getDocumentById(@PathVariable Long id){
        return service.getDocumentByID(id);
    }
    @GetMapping()
    List<AcceptDocumentDTO> getAllDocument(){
        return service.getAllDocument();
    }

    @PostMapping()
    AcceptDocumentDTO createDocument(@RequestBody AcceptDocumentDTO acceptDocumentDTO){
        return service.createDocument(acceptDocumentDTO);
    }
    @PutMapping("/{id}")
    AcceptDocumentDTO updateDocument(@PathVariable Long id,@RequestBody AcceptDocumentDTO acceptDocumentDTO){
        return service.updateDocument(id, acceptDocumentDTO);
    }
    @DeleteMapping("/{id}")
    void deleteDocument(@PathVariable Long id){
         service.deleteDocumentById(id);
    }

}
