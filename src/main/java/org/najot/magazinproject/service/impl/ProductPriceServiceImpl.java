package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.ProductPriceDTO;
import org.najot.magazinproject.entity.ProductPrice;
import org.najot.magazinproject.mapper.ProductPriceMapper;
import org.najot.magazinproject.repository.ProductPriceRepository;
import org.najot.magazinproject.repository.ProductRepository;
import org.najot.magazinproject.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductPriceServiceImpl implements ProductPriceService {
    @Autowired
    private ProductPriceRepository repository;
    @Autowired
    private ProductPriceMapper mapper;
    @Autowired
    private ProductRepository productRepository;
    @Override
    public ProductPriceDTO getProductPriceById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ProductPriceDTO> getAllProductPrice() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ProductPriceDTO createProductPrice(ProductPriceDTO productPriceDTO) {
        return mapper.toDTO(repository
                .save(mapper
                        .toEntity(productPriceDTO)));
    }

    @Override
    public ProductPriceDTO updateProductPrice(Long id, ProductPriceDTO productPriceDTO) {
        ProductPrice productPrice =repository.getReferenceById(id);
        productPrice.setId(productPriceDTO.getId());
        productPrice.setProduct(productRepository.getReferenceById(productPriceDTO.getPrice()));
        productPrice.setPrice(productPriceDTO.getPrice());
        productPrice.setDate(productPriceDTO.getDate());
        productPrice.setStatus(productPrice.getStatus());
        productPrice=repository.save(productPrice);
        return mapper.toDTO(productPrice);
    }

    @Override
    public void deleteProductPriceById(Long id) {
        repository.deleteById(id);
    }
}
