package org.najot.magazinproject.mapper;

import jakarta.persistence.EntityManager;
import org.mapstruct.Mapper;
import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.najot.magazinproject.entity.AcceptDocument;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface AcceptDocumentMapper extends Entitymapper<AcceptDocumentDTO, AcceptDocument> {
}