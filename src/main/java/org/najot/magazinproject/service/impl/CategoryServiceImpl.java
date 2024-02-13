package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.CategoryDTO;
import org.najot.magazinproject.entity.Category;
import org.najot.magazinproject.mapper.CategoryMapper;
import org.najot.magazinproject.repository.CategoryRepository;
import org.najot.magazinproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;
    @Autowired
    private CategoryMapper mapper;
    @Override
    public CategoryDTO getCategoryById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<CategoryDTO> getAllCategory() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return mapper.toDTO(repository.save(mapper.toEntity(categoryDTO)));
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO) {
        Category category=repository.getReferenceById(id);
        category.setId(categoryDTO.getId());
        category.setName(categoryDTO.getName());
        category=repository.save(category);
        return mapper.toDTO(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        repository.deleteById(id);
    }
}
