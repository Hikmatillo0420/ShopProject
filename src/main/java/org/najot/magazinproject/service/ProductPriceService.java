package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.ProductPriceDTO;
import org.najot.magazinproject.entity.ProductPrice;

import java.util.List;

public interface ProductPriceService {
    ProductPriceDTO getProductPriceById(Long id);
    List<ProductPriceDTO> getAllProductPrice();
    ProductPriceDTO createProductPrice(ProductPriceDTO productPriceDTO);
    ProductPriceDTO updateProductPrice(Long id, ProductPriceDTO productPriceDTO);
    void deleteProductPriceById (Long id);
}
