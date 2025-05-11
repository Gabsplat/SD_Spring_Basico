package com.aconcagua.sd_spring_basico.business.mapper;

import com.aconcagua.sd_spring_basico.domain.dtos.PersonaFullDto;
import com.aconcagua.sd_spring_basico.domain.dtos.PersonaShortDto;
import com.aconcagua.sd_spring_basico.domain.entities.Domicilio;
import com.aconcagua.sd_spring_basico.domain.entities.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaFullDto personaToPersonaFullDto(Persona persona);

    Persona personaFullDtoToPersona(PersonaFullDto personaFullDto);

    @Mapping(source = "domicilio.provincia", target = "provincia")
    PersonaShortDto personaToPersonaShortDto(Persona persona);

}

