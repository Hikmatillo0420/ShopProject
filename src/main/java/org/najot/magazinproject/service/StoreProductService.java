package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.StoreProductDTO;

import java.util.List;

public interface StoreProductService {
    StoreProductDTO getStoreProductById(Long id);
    List<StoreProductDTO> getAllStoreProduct();
    StoreProductDTO createStoreProduct(StoreProductDTO dto);
    StoreProductDTO updateStoreProduct(Long id,StoreProductDTO dto);
    void deleteStoreProductById(Long id);

}
