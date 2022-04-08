package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.Persona;

public interface IPersonaService {
    
    public String creador(Persona persona);
    public void borrador(Long id);
    public List<Persona> listarPersonas();
    public Persona encontrarMail(String email, String password);
    public boolean checkExist (Persona persona);

}