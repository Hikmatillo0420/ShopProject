package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.najot.magazinproject.entity.AcceptDocumentItem;
import org.najot.magazinproject.mapper.AcceptDocumentItemMapper;
import org.najot.magazinproject.repository.AcceptDocumentItemRepository;
import org.najot.magazinproject.repository.AcceptDocumentRepository;
import org.najot.magazinproject.repository.ProductRepository;
import org.najot.magazinproject.service.AcceptDocumentItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcceptDocumentItemServiceImpl implements AcceptDocumentItemService{
    @Autowired
    private AcceptDocumentItemRepository repository;
    @Autowired
    private AcceptDocumentItemMapper mapper;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AcceptDocumentRepository documentRepository;

    @Override
    public AcceptDocumentItemDTO getDocumentItemById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<AcceptDocumentItemDTO> getAllDocumentItem() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public AcceptDocumentItemDTO createDocumentItem(AcceptDocumentItemDTO acceptDocumentItemDTO) {
        return mapper.toDTO(repository
                .save(mapper
                        .toEntity(acceptDocumentItemDTO)));
    }

    @Override
    public AcceptDocumentItemDTO updateDocumentItem(Long id, AcceptDocumentItemDTO acceptDocumentItemDTO) {
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
    public void deleteDocumentItemById(Long id) {
        repository.deleteById(id);
    }


}
