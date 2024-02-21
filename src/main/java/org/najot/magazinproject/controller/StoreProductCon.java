package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.StoreProductDTO;
import org.najot.magazinproject.service.impl.StoreProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("/api/StoreProduct")
public class StoreProductCon {
    @Autowired
    private StoreProductServiceImpl service;

    @GetMapping("/{id}")
    private StoreProductDTO getStoreProductById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    private List<StoreProductDTO> getAllStoreProduct(){
        return service.getAll();
    }
    @PostMapping()
    private StoreProductDTO createproduce(@RequestBody StoreProductDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    private StoreProductDTO updateStoreProduct(@PathVariable Long id,@RequestBody StoreProductDTO dto){
        return service.update(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteStoreProduct(@PathVariable Long id){
        service.deleteById(id);
    }
}
