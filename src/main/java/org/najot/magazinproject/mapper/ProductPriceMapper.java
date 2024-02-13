package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.ProductPriceDTO;
import org.najot.magazinproject.entity.ProductPrice;

@Mapper(componentModel = "spring")
public interface ProductPriceMapper extends Entitymapper<ProductPriceDTO, ProductPrice>{
}
