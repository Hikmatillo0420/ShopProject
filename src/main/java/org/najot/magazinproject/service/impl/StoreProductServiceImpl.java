package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.StoreProductDTO;
import org.najot.magazinproject.entity.StoreProduct;
import org.najot.magazinproject.mapper.StoreProductMapper;
import org.najot.magazinproject.repository.ProductRepository;
import org.najot.magazinproject.repository.StoreProductRepository;
import org.najot.magazinproject.service.StoreProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreProductServiceImpl implements StoreProductService{

    @Autowired
    private StoreProductMapper mapper;
    @Autowired
    private StoreProductRepository repository;
    @Override
    public StoreProductDTO getStoreProductById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<StoreProductDTO> getAllStoreProduct() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public StoreProductDTO createStoreProduct(StoreProductDTO dto) {
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public StoreProductDTO updateStoreProduct(Long id, StoreProductDTO dto) {
        StoreProduct storeProduct =repository.getReferenceById(id);
        storeProduct.setId(dto.getId());
        storeProduct.setProduceId(dto.getProduceId());
        storeProduct.setAmount(dto.getAmount());
        storeProduct=repository.save(storeProduct);
        return mapper.toDTO(storeProduct);
    }

    @Override
    public void deleteStoreProductById(Long id) {
        repository.deleteById(id);
    }
}
