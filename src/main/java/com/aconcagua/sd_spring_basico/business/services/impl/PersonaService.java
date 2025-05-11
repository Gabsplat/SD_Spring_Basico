package com.aconcagua.sd_spring_basico.business.services.impl;

import com.aconcagua.sd_spring_basico.business.services.IPersonaService;
import com.aconcagua.sd_spring_basico.domain.entities.Persona;
import com.aconcagua.sd_spring_basico.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public Persona crear(Persona persona) {

        return personaRepository.save(persona);
    }

    @Override
    public Persona getById(Long id) {
        var persona = personaRepository.findById(id);
        if(persona.isEmpty()) throw new RuntimeException("No hay ninguna persona con el id " + id);
        return persona.get();
    }
}

