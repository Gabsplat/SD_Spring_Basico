package com.aconcagua.sd_spring_basico.business.facade;

import com.aconcagua.sd_spring_basico.domain.dtos.PersonaFullDto;
import com.aconcagua.sd_spring_basico.domain.dtos.PersonaShortDto;

public interface IPersonaFacade {

    PersonaFullDto crear(PersonaFullDto nuevaPersonaDto);

    PersonaFullDto getAllDataById(Long id);

    PersonaShortDto getShortDataById(Long id);

}

