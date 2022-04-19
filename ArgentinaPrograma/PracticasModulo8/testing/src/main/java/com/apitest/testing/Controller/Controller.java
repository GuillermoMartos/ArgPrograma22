package com.apitest.testing.Controller;

import java.util.List;

import com.apitest.testing.Model.Login;
import com.apitest.testing.Model.Persona;
import com.apitest.testing.Services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// el decorador RestController le indica a SrpingBoot que acá van a estar los métodos relacionados con el mapeo JPA
@RestController
@CrossOrigin(origins = { "http://localhost:4200/" })
public class Controller {
    @Autowired
    PersonaService personaService;

    @PostMapping("/creador")
    // @ResponseBody
    public void create(@RequestBody Persona persona) {
        personaService.creador(persona);
    }

    @DeleteMapping("/borrador/{id}")
    public void erase(@PathVariable Long id) {
        personaService.borrador(id);
    }

    @GetMapping("/list")
    public List<Persona> showAll() {
        return personaService.listarPersonas();
    }

   

    @PostMapping("/user/login")
    @ResponseBody
    public Persona buscaporMail(@RequestBody Login datos) {

        return personaService.encontrarMail(datos.getEmail(), datos.getPassword());
    }

    @PutMapping("/udpate/user")
    public void actualizarUsuario(@RequestBody Persona persona) {
        personaService.updatePersona(persona);
    }
}
