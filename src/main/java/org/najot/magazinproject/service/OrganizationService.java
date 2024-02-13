package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.OrganizationDTO;
import org.najot.magazinproject.entity.Organization;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrganizationService {
    OrganizationDTO getOrganizationById(Long id);
    List<OrganizationDTO> getAllOrganization();
    OrganizationDTO createOrganization(OrganizationDTO organizationDTO);
    OrganizationDTO updateOrganization(Long id,OrganizationDTO organizationDTO);
    void deleteOrganizationById(Long id);
}
