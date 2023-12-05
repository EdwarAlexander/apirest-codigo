package com.emoran.apirest.controller;

import com.emoran.apirest.entity.PersonaEntity;
import com.emoran.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/create")
    public PersonaEntity create(@RequestBody PersonaEntity persona){
        return personaService.create(persona);
    }

    @PutMapping("/update")
    public PersonaEntity update(@RequestBody PersonaEntity persona){
        return personaService.update(persona);
    }

    @GetMapping("/lista")
    public List<PersonaEntity> findAll(){
        return personaService.findAll();
    }

    @GetMapping("/persona/{id}")
    public PersonaEntity findById(@PathVariable Long id){
        return personaService.findById(id);
    }
}
