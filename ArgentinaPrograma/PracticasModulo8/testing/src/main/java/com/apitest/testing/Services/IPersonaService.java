package com.apitest.testing.Services;

import java.util.List;
import java.util.UUID;

import com.apitest.testing.Model.Persona;

public interface IPersonaService {
    
    public Persona creador(Persona persona);
    public void borrador(UUID id);
    public List<Persona> listarPersonas();

}
