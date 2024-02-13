package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.ProductDTO;
import org.najot.magazinproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Product")
public class ProductCon {
    @Autowired
    private ProductService service;
    @GetMapping("/{id}")
    ProductDTO getProductById(@PathVariable Long id){
        return service.getProductById(id);
    }
    @GetMapping()
    List<ProductDTO> getAllProduct(){
        return service.getAllProduct();
    }
    @PostMapping()
    ProductDTO createProduct(@RequestBody ProductDTO dto){
        return service.createProduct(dto);
    }
    @PutMapping("/{id}")
    ProductDTO updateProduct(@PathVariable Long id,@RequestBody ProductDTO dto){
        return service.updateProduct(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteProductById(@PathVariable Long id){
        service.deleteproductById(id);
    }
}
