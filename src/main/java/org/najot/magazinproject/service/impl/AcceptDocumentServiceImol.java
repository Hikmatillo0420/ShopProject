package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.najot.magazinproject.entity.AcceptDocument;
import org.najot.magazinproject.mapper.AcceptDocumentMapper;
import org.najot.magazinproject.repository.AcceptDocumentRepository;
import org.najot.magazinproject.repository.OrganizationRepository;
import org.najot.magazinproject.service.AcceptDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcceptDocumentServiceImol implements AcceptDocumentService {
    @Autowired
    private AcceptDocumentRepository repository;
    @Autowired
    private AcceptDocumentMapper mapper;
    @Autowired
    private OrganizationRepository organizationRepository;
    @Override
    public AcceptDocumentDTO getDocumentByID(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<AcceptDocumentDTO> getAllDocument() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public AcceptDocumentDTO createDocument(AcceptDocumentDTO acceptDocumentDTO) {
        return mapper.toDTO(repository
                .save(mapper
                        .toEntity(acceptDocumentDTO)));
    }

    @Override
    public AcceptDocumentDTO updateDocument(Long id, AcceptDocumentDTO acceptDocumentDTO) {
        AcceptDocument acceptDocument=repository.getReferenceById(id);
        acceptDocument.setId(acceptDocumentDTO.getId());
        acceptDocument.setDocNumber(acceptDocumentDTO.getDocNumber());
        acceptDocument.setOrganization(organizationRepository.getReferenceById(acceptDocumentDTO.getOrganizationId()));
        acceptDocument.setData(acceptDocumentDTO.getData());
        acceptDocument =repository.save(acceptDocument);
        return mapper.toDTO(acceptDocument);
    }

    @Override
    public void deleteDocumentById(Long id) {
        repository.deleteById(id);

    }
}
