package com.killerinstinct.containmentzone.controllers;

import com.killerinstinct.containmentzone.model.User;
import com.killerinstinct.containmentzone.model.Zone;
import com.killerinstinct.containmentzone.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ZonesController {

    @Autowired
    ZoneRepository zoneRepository;

    @PostMapping("/zone")
    public String createZone(@RequestBody Zone zone){
        zoneRepository.save(zone);
        return "Zone added successfully";
    }

    @GetMapping("/zones")
    public List<Zone> getAllZone(){
        return zoneRepository.findAll();
    }

    @GetMapping("/zone")
    public List<Zone> findByPincode(@RequestParam(required = true) int pincode){
        return zoneRepository.findByPincode(pincode);
    }

}
