package com.emoran.apirest.service;

import com.emoran.apirest.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {

    PersonaEntity create(PersonaEntity persona);

    PersonaEntity update(PersonaEntity persona);

    List<PersonaEntity> findAll();

    PersonaEntity findById(Long id);
}
