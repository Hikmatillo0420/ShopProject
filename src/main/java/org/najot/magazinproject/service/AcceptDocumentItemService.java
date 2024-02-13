package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.AcceptDocumentItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AcceptDocumentItemService {
AcceptDocumentItemDTO getDocumentItemById(Long id);
List<AcceptDocumentItemDTO> getAllDocumentItem();
AcceptDocumentItemDTO createDocumentItem(AcceptDocumentItemDTO acceptDocumentItemDTO);
AcceptDocumentItemDTO updateDocumentItem(Long id, AcceptDocumentItemDTO acceptDocumentItemDTO);
void deleteDocumentItemById(Long id);
}
