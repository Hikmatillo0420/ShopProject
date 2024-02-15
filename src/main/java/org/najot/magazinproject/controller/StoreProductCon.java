package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.StoreProductDTO;
import org.najot.magazinproject.service.StoreProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("/api/StoreProduct")
public class StoreProductCon {
    @Autowired
    private StoreProductService service;

    @GetMapping("/{id}")
    private StoreProductDTO getStoreProductById(@PathVariable Long id){
        return service.getStoreProductById(id);
    }
    @GetMapping()
    private List<StoreProductDTO> getAllStoreProduct(){
        return service.getAllStoreProduct();
    }
    @PostMapping()
    private StoreProductDTO createproduce(@RequestBody StoreProductDTO dto){
        return service.createStoreProduct(dto);
    }
    @PutMapping("/{id}")
    private StoreProductDTO updateStoreProduct(@PathVariable Long id,@RequestBody StoreProductDTO dto){
        return service.updateStoreProduct(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteStoreProduct(@PathVariable Long id){
        service.deleteStoreProductById(id);
    }
}
