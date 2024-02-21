package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.ProductPriceDTO;
import org.najot.magazinproject.service.impl.ProductPriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productPrice")
public class ProductPriceCon {
    @Autowired
    private ProductPriceServiceImpl service;
    @GetMapping("/{id}")
    ProductPriceDTO getProductById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<ProductPriceDTO> getAllProductPro(){
        return service.getAll();
    }
    @PostMapping()
    ProductPriceDTO  createproductPrice(@RequestBody ProductPriceDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    ProductPriceDTO updateProducePrice(@PathVariable Long id,@RequestBody ProductPriceDTO dto){
        return service.update(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteProducePrice(@PathVariable Long id){
        service.deleteById(id);
    }
}
