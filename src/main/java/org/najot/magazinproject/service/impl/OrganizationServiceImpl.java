package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.OrganizationDTO;
import org.najot.magazinproject.entity.Organization;
import org.najot.magazinproject.mapper.OrganizationMapper;
import org.najot.magazinproject.repository.OrganizationRepository;
import org.najot.magazinproject.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganizationServiceImpl implements ServiceAll<OrganizationDTO> {
    @Autowired
    private OrganizationRepository repository;
    @Autowired
    private OrganizationMapper mapper;
    @Override
    public OrganizationDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<OrganizationDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public OrganizationDTO create(OrganizationDTO organizationDTO) {
        return mapper.toDTO(repository.save(mapper.toEntity(organizationDTO)));
    }

    @Override
    public OrganizationDTO update(Long id, OrganizationDTO organizationDTO) {
        Organization organization=repository.getReferenceById(id);
        organization.setId(organizationDTO.getId());
        organization.setName(organizationDTO.getName());
        organization.setAddress(organizationDTO.getAddress());
        organization.setPhoneNumber(organizationDTO.getPhoneNumber());
        organization =repository.save(organization);
        return mapper.toDTO(organization);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
