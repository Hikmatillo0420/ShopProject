package org.najot.magazinproject.mapper;

import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.najot.magazinproject.entity.AcceptDocument;
import org.najot.magazinproject.entity.AcceptDocumentItem;

@Mapper(componentModel = "spring")
public interface AcceptDocumentItemMapper extends Entitymapper<AcceptDocumentItemDTO, AcceptDocumentItem>{

}
