package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.ProductDTO;
import org.najot.magazinproject.entity.Product;
import org.najot.magazinproject.mapper.ProductMapper;
import org.najot.magazinproject.mapper.ProductPriceMapperImpl;
import org.najot.magazinproject.repository.CategoryRepository;
import org.najot.magazinproject.repository.MeasurementRepository;
import org.najot.magazinproject.repository.ProductRepository;
import org.najot.magazinproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
     private ProductRepository repository;
    @Autowired
    private ProductMapper mapper;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private MeasurementRepository measurementRepository;
    @Override
    public ProductDTO getProductById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                .toEntity(productDTO)));
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        Product product=repository.getReferenceById(id);
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setCategory(categoryRepository.getReferenceById(productDTO.getCategoryId()));
        product.setMeasurements(measurementRepository.getReferenceById(productDTO.getMeasureType()));
        product.setAmount(productDTO.getAmount());
        product =repository.save(product);
        return mapper.toDTO(product);
    }
    @Override
    public void deleteproductById(Long id) {
        repository.deleteById(id);
    }
}
