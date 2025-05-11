package com.aconcagua.sd_spring_basico.business.services;

import com.aconcagua.sd_spring_basico.domain.entities.Persona;

public interface IPersonaService {
    Persona crear(Persona persona);
    Persona getById(Long id);
}

