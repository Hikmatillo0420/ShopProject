package org.najot.magazinproject.service;

import org.najot.magazinproject.dto.MeasurementDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MeasurementService {
    MeasurementDTO getMeasurementById(Long id);
    List<MeasurementDTO> getAllMeasurement();
    MeasurementDTO createMeasurement(MeasurementDTO measurementDTO);
    MeasurementDTO updateMeasurement(Long id, MeasurementDTO measurementDTO);
    void deleteMeasurmentById(Long id);

}
