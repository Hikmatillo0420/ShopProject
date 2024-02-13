package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.CategoryDTO;
import org.najot.magazinproject.entity.Category;

@Mapper(componentModel = "spring")

public interface CategoryMapper extends Entitymapper<CategoryDTO, Category>{
}
