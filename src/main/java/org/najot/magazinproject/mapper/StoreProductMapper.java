package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.StoreProductDTO;
import org.najot.magazinproject.entity.StoreProduct;

@Mapper(componentModel = "spring")
public interface StoreProductMapper extends Entitymapper<StoreProductDTO,StoreProduct>{
}
