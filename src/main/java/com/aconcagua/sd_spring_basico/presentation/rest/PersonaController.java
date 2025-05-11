package com.aconcagua.sd_spring_basico.presentation.rest;

import com.aconcagua.sd_spring_basico.business.facade.IPersonaFacade;
import com.aconcagua.sd_spring_basico.domain.dtos.PersonaFullDto;
import com.aconcagua.sd_spring_basico.domain.dtos.PersonaShortDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaFacade personaFacade;

    @GetMapping("/all/{id}")
    public ResponseEntity<PersonaFullDto> getAllDataById(@PathVariable Long id){
        return ResponseEntity.ok().body(personaFacade.getAllDataById(id));
    }

    @GetMapping("/short/{id}")
    public ResponseEntity<PersonaShortDto> getShortDataById(@PathVariable Long id){
        return ResponseEntity.ok().body(personaFacade.getShortDataById(id));
    }

    @PostMapping()
    public ResponseEntity<PersonaFullDto> crear(@RequestBody PersonaFullDto personaFullDto){
        return ResponseEntity.ok().body(personaFacade.crear(personaFullDto));
    }

}

