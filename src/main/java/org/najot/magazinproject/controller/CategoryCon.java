package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.CategoryDTO;
import org.najot.magazinproject.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryCon {
    @Autowired
    private CategoryServiceImpl service;
    @GetMapping("/{id}")
    CategoryDTO getCategoryId(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<CategoryDTO> getAllCategory(){
        return service.getAll();
    }
    @PostMapping()
    CategoryDTO createCategory(@RequestBody CategoryDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    CategoryDTO updateCategory(@PathVariable Long id,@RequestBody CategoryDTO dto){
        return service.update(id, dto);
    }
    @DeleteMapping({"/{id}"})
    void deleteCategory(@PathVariable Long id){
        service.deleteById(id);
    }

}
