package com.apitest.testing.Services;

import java.util.List;
import java.util.UUID;

import com.apitest.testing.Model.Persona;
import com.apitest.testing.Repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

@Autowired
PersonaRepository personaRepository;

    @Override
    public Persona creador(Persona persona) {
        Persona a= personaRepository.save(persona);
        System.out.println(a.toString());
        return persona;
    }

    @Override
    public void borrador(UUID id) {
        personaRepository.deleteById(id);
    }

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
    
}
