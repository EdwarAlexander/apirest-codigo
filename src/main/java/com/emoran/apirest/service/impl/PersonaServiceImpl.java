package com.emoran.apirest.service.impl;

import com.emoran.apirest.dao.PersonaDao;
import com.emoran.apirest.entity.PersonaEntity;
import com.emoran.apirest.service.PersonaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaDao personaDao;

    @Override
    public PersonaEntity create(PersonaEntity persona) {
        return personaDao.save(persona);
    }

    @Override
    public PersonaEntity update(PersonaEntity persona) {
        return personaDao.save(persona);
    }

    @Override
    public List<PersonaEntity> findAll() {
        return personaDao.findAll();
    }

    @Override
    public PersonaEntity findById(Long id) {
        return personaDao.findById(id).orElse(null);
    }
}
