package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Persona;

public interface IPersonaService {
    
    public Deleter creador(Persona persona);
    public void borrador(Long id);
    public List<Persona> listarPersonas();
    public Persona encontrarMail(String email, String password);
    public boolean checkExist (Persona persona);
    public void updatePersona(Persona persona);
    public Persona findById(Long id);
}
