package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.ProductDTO;
import org.najot.magazinproject.service.ServiceAll;
import org.najot.magazinproject.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Product")
public class ProductCon {
    @Autowired
    private ProductServiceImpl service;
    @GetMapping("/{id}")
    ProductDTO getProductById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<ProductDTO> getAllProduct(){
        return service.getAll();
    }
    @PostMapping()
    ProductDTO createProduct(@RequestBody ProductDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    ProductDTO updateProduct(@PathVariable Long id,@RequestBody ProductDTO dto){
        return service.update(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteProductById(@PathVariable Long id){
        service.deleteById(id);
    }
}
