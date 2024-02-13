package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.MeasurementDTO;
import org.najot.magazinproject.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Measurement")
public class MeasurementCon {
    @Autowired
    private MeasurementService service;
    @GetMapping("/{id}")
    MeasurementDTO getMeasurementById(@PathVariable Long id){
        return service.getMeasurementById(id);
    }
    @GetMapping()
    List<MeasurementDTO> getAllMeasurement(){
        return service.getAllMeasurement();
    }
    @PostMapping()
    MeasurementDTO createMeasurement(@RequestBody MeasurementDTO dto){
        return service.createMeasurement(dto);
    }
    @PutMapping("/{id}")
    MeasurementDTO updateMeasurement(@PathVariable Long id, @RequestBody MeasurementDTO dto){
        return service.updateMeasurement(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteMeasurement(@PathVariable Long id){
        service.deleteMeasurmentById(id);
    }
}
