package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.MeasurementDTO;
import org.najot.magazinproject.entity.Measurement;

@Mapper(componentModel = "spring")

public interface MeasurementMapper extends Entitymapper<MeasurementDTO, Measurement>{
}
