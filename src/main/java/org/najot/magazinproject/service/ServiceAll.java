package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.AcceptDocumentItemDTO;

import java.util.List;

public interface ServiceAll<DTO> {
    DTO getById(Long id);
    List<DTO> getAll();
    DTO create(DTO dto);
    DTO update(Long id, DTO dto);
    void deleteById(Long id);
}
