package org.najot.magazinproject.service.impl;

import org.najot.magazinproject.dto.MeasurementDTO;
import org.najot.magazinproject.entity.Measurement;
import org.najot.magazinproject.mapper.MeasurementMapper;
import org.najot.magazinproject.repository.MeasurementRepository;
import org.najot.magazinproject.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeasurementServiceImpl implements ServiceAll<MeasurementDTO> {
    @Autowired
    private MeasurementRepository repository;
    @Autowired
    private MeasurementMapper mapper;
    @Override
    public MeasurementDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<MeasurementDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public MeasurementDTO create(MeasurementDTO measurementDTO) {
        return mapper.toDTO(repository.save(mapper.toEntity(measurementDTO)));
    }

    @Override
    public MeasurementDTO update(Long id, MeasurementDTO measurementDTO) {
        Measurement measurement=repository.getReferenceById(id);
        measurement.setId(measurementDTO.getId());
        measurement.setName(measurementDTO.getName());
        measurement =repository.save(measurement);
        return mapper.toDTO(measurement);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
