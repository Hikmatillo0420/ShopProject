package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.CategoryDTO;
import org.najot.magazinproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryCon {
    @Autowired
    private CategoryService service;
    @GetMapping("/{id}")
    CategoryDTO getCategoryId(@PathVariable Long id){
        return service.getCategoryById(id);
    }
    @GetMapping()
    List<CategoryDTO> getAllCategory(){
        return service.getAllCategory();
    }
    @PostMapping()
    CategoryDTO createCategory(@RequestBody CategoryDTO dto){
        return service.createCategory(dto);
    }
    @PutMapping("/{id}")
    CategoryDTO updateCategory(@PathVariable Long id,@RequestBody CategoryDTO dto){
        return service.updateCategory(id, dto);
    }
    @DeleteMapping({"/{id}"})
    void deleteCategory(@PathVariable Long id){
        service.deleteCategoryById(id);
    }

}
