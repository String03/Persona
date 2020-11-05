package com.Laura.Persona.Services;

import com.Laura.Persona.EE.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaService extends CrudRepository<Persona,Integer> {
}
