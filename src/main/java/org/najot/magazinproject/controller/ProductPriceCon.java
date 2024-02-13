package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.ProductPriceDTO;
import org.najot.magazinproject.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productPrice")
public class ProductPriceCon {
    @Autowired
    private ProductPriceService service;
    @GetMapping("/{id}")
    ProductPriceDTO getProductById(@PathVariable Long id){
        return service.getProductPriceById(id);
    }
    @GetMapping()
    List<ProductPriceDTO> getAllProductPro(){
        return service.getAllProductPrice();
    }
    @PostMapping()
    ProductPriceDTO  createproductPrice(@RequestBody ProductPriceDTO dto){
        return service.createProductPrice(dto);
    }
    @PutMapping("/{id}")
    ProductPriceDTO updateProducePrice(@PathVariable Long id,@RequestBody ProductPriceDTO dto){
        return service.updateProductPrice(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteProducePrice(@PathVariable Long id){
        service.deleteProductPriceById(id);
    }
}
