package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.Persona;
import com.apitest.testing.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public String creador(Persona persona) {
        if(checkExist(persona)!=true) {
            personaRepository.save(persona);
            return "created";
        }
        return "email already exist, please try other email";
    }

    @Override
    public boolean checkExist(Persona persona) {
        System.out.println(persona.getEmail());
        return personaRepository.findByEmail(persona.getEmail())!=null?true:false;
    }

    @Override
    public void borrador(Long id) {
        personaRepository.deleteById(id);
    }

    public Persona encontrarMail(String email, String password) {
        Persona busca= personaRepository.findByEmail(email);
        if(busca != null)return busca.getPassword().equals(password) ? busca : null;
        return busca;
    }

    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaRepository.findAll();
    }

}
