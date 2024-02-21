package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.CategoryDTO;
import org.najot.magazinproject.entity.Category;
import org.najot.magazinproject.mapper.CategoryMapper;
import org.najot.magazinproject.repository.CategoryRepository;
import org.najot.magazinproject.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements ServiceAll<CategoryDTO> {
    @Autowired
    private CategoryRepository repository;
    @Autowired
    private CategoryMapper mapper;


    @Override
    public CategoryDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<CategoryDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public CategoryDTO create(CategoryDTO dto) {
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO dto) {
        Category category=repository.getReferenceById(id);
        category.setId(dto.getId());
        category.setName(dto.getName());
        category=repository.save(category);
        return mapper.toDTO(category);    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);

    }
}

