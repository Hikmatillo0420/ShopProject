package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.ProductDTO;
import org.najot.magazinproject.entity.Product;

import java.util.List;

public interface ProductService {
    ProductDTO getProductById(Long id);
    List<ProductDTO> getAllProduct();
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    void deleteproductById(Long id);
}
