package com.example.codeclan.pirateSrevice.controllers;

import com.example.codeclan.pirateSrevice.models.Pirate;
import com.example.codeclan.pirateSrevice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pirates")
public class PirateController {
    //Dependency Injection
    @Autowired
    PirateRepository pirateRepository;
    @GetMapping
    public List<Pirate> getAllPirates(){
        return pirateRepository .findAll();
    }


    @GetMapping("{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }

}
