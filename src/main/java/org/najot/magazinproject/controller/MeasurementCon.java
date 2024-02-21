package org.najot.magazinproject.controller;

import org.najot.magazinproject.dto.MeasurementDTO;
import org.najot.magazinproject.service.impl.MeasurementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Measurement")
public class MeasurementCon {
    @Autowired
    private MeasurementServiceImpl service;
    @GetMapping("/{id}")
    MeasurementDTO getMeasurementById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping()
    List<MeasurementDTO> getAllMeasurement(){
        return service.getAll();
    }
    @PostMapping()
    MeasurementDTO createMeasurement(@RequestBody MeasurementDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    MeasurementDTO updateMeasurement(@PathVariable Long id, @RequestBody MeasurementDTO dto){
        return service.update(id, dto);
    }
    @DeleteMapping("/{id}")
    void deleteMeasurement(@PathVariable Long id){
        service.deleteById(id);
    }
}
