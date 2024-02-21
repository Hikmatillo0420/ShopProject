package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.najot.magazinproject.entity.AcceptDocumentItem;
import org.najot.magazinproject.mapper.AcceptDocumentItemMapper;
import org.najot.magazinproject.repository.AcceptDocumentItemRepository;
import org.najot.magazinproject.repository.AcceptDocumentRepository;
import org.najot.magazinproject.repository.ProductRepository;
import org.najot.magazinproject.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcceptDocumentItemServiceImpl implements ServiceAll<AcceptDocumentItemDTO> {
    @Autowired
    private AcceptDocumentItemRepository repository;
    @Autowired
    private AcceptDocumentItemMapper mapper;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AcceptDocumentRepository documentRepository;

    @Override
    public AcceptDocumentItemDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<AcceptDocumentItemDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public AcceptDocumentItemDTO create(AcceptDocumentItemDTO acceptDocumentItemDTO) {
        return mapper.toDTO(repository
                .save(mapper
                        .toEntity(acceptDocumentItemDTO)));
    }

    @Override
    public AcceptDocumentItemDTO update(Long id, AcceptDocumentItemDTO acceptDocumentItemDTO) {
        AcceptDocumentItem documentItem =repository.getReferenceById(id);
        documentItem.setId(acceptDocumentItemDTO.getId());
        documentItem.setDocument(documentRepository.getReferenceById(acceptDocumentItemDTO.getId()));
        documentItem.setProduct(productRepository.getReferenceById(acceptDocumentItemDTO.getProduct_id()));
        documentItem.setComePrice(acceptDocumentItemDTO.getComePrice());
        documentItem.setCount(acceptDocumentItemDTO.getCount());
        documentItem =repository.save(documentItem);
        return mapper.toDTO(documentItem);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
