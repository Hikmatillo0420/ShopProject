package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.ProductDTO;
import org.najot.magazinproject.entity.Product;

@Mapper(componentModel = "spring")

public interface ProductMapper extends Entitymapper<ProductDTO, Product>{
}
