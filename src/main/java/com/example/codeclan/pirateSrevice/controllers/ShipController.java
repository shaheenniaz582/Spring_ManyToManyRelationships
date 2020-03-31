package com.example.codeclan.pirateSrevice.controllers;

import com.example.codeclan.pirateSrevice.models.Pirate;
import com.example.codeclan.pirateSrevice.models.Ship;
import com.example.codeclan.pirateSrevice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value="/ships")
public class ShipController {
    @Autowired
    ShipRepository shipRepository;

    @GetMapping
    public List<Ship> getAllShips(){
        return shipRepository .findAll();
    }

    @GetMapping("{id}")
    public Optional<Ship> getShip(@PathVariable Long id){
        return shipRepository.findById(id);
    }
}
