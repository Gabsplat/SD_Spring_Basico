package com.aconcagua.sd_spring_basico.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonaShortDto {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private DomicilioDto domicilio;
}
