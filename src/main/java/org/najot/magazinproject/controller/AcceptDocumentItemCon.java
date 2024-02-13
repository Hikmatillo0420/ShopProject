package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.najot.magazinproject.entity.AcceptDocumentItem;
import org.najot.magazinproject.service.AcceptDocumentItemService;
import org.najot.magazinproject.service.AcceptDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiDocumentitem")
public class AcceptDocumentItemCon {
    @Autowired
    private AcceptDocumentItemService service;
    @GetMapping("/{id}")
    AcceptDocumentItemDTO getDocumentItemById(@PathVariable Long id){
        return service.getDocumentItemById(id);
    }
    @GetMapping()
    List<AcceptDocumentItemDTO> getAllDocumentItem(){
        return service.getAllDocumentItem();
    }
    @PostMapping()
    AcceptDocumentItemDTO createDocumentItem(@RequestBody AcceptDocumentItemDTO dto){
        return service.createDocumentItem(dto);
    }
    @PutMapping("/{id}")
    AcceptDocumentItemDTO updateDocumentItem(Long id,AcceptDocumentItemDTO dto){
        return service.updateDocumentItem(id,dto);
    }
    @DeleteMapping("/{id}")
    void deleteDocumentItemDto(@PathVariable Long id){
        service.deleteDocumentItemById(id);
    }
}
