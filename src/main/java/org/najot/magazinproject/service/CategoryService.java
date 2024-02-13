package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    CategoryDTO getCategoryById(Long id);
    List<CategoryDTO> getAllCategory();
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(Long id,CategoryDTO categoryDTO);
    void deleteCategoryById(Long id);
}
