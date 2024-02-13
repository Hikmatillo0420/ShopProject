package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.OrganizationDTO;
import org.najot.magazinproject.entity.Organization;

@Mapper(componentModel = "spring")

public interface OrganizationMapper extends Entitymapper<OrganizationDTO, Organization>{
}
