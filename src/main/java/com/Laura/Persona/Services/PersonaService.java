package com.Laura.Persona.Services;

import com.Laura.Persona.EE.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "personas", path = "persona")

public interface PersonaService extends CrudRepository<Persona,Integer> {
}
