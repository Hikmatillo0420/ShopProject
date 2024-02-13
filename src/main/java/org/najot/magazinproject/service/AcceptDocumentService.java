package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.AcceptDocumentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AcceptDocumentService {
AcceptDocumentDTO getDocumentByID(Long id);
List<AcceptDocumentDTO> getAllDocument();
AcceptDocumentDTO createDocument(AcceptDocumentDTO acceptDocumentDTO);
AcceptDocumentDTO updateDocument(Long id, AcceptDocumentDTO acceptDocumentDTO);
void deleteDocumentById(Long id);
}
