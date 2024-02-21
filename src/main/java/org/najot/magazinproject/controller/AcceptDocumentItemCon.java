package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.najot.magazinproject.service.impl.AcceptDocumentItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiDocumentitem")
public class AcceptDocumentItemCon {
    @Autowired
    private AcceptDocumentItemServiceImpl service;
    @GetMapping("/{id}")
    AcceptDocumentItemDTO getDocumentItemById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<AcceptDocumentItemDTO> getAllDocumentItem(){
        return service.getAll();
    }
    @PostMapping()
    AcceptDocumentItemDTO createDocumentItem(@RequestBody AcceptDocumentItemDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    AcceptDocumentItemDTO updateDocumentItem(Long id,AcceptDocumentItemDTO dto){
        return service.update(id,dto);
    }
    @DeleteMapping("/{id}")
    void deleteDocumentItemDto(@PathVariable Long id){
        service.deleteById(id);
    }
}
