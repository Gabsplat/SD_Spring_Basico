package com.aconcagua.sd_spring_basico.repositories;

import com.aconcagua.sd_spring_basico.domain.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface PersonaRepository extends JpaRepository<Persona,Long> {

}

