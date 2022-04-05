package com.apitest.testing.Controller;

import java.util.List;
import java.util.UUID;

import com.apitest.testing.Model.Persona;
import com.apitest.testing.Services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// el decorador RestController le indica a SrpingBoot que acá van a estar los métodos relacionados con el mapeo JPA
@RestController
public class Controller {
@Autowired
PersonaService personaService;

@GetMapping("/persona/{nombre}")
public String saludar(@PathVariable String nombre){
    return "hola, buenas noches! "+nombre;
}

@GetMapping("/buenas")
public String buenas(@RequestParam String nombre){
    return "hola hola, "+nombre;
}

@PostMapping("/creador")
public Persona create(@RequestBody Persona persona){
    
 Persona people=personaService.creador(persona);
 return people;
}

@PostMapping("/borrador/{id}")
public void erase(UUID id){
    personaService.borrador(id);
}

@GetMapping("/list")
public List showAll(){
    return personaService.listarPersonas();
}

}
