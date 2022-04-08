package com.apitest.testing.Repository;



import com.apitest.testing.Model.Persona;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository <Persona, Long> {
    Persona findByEmail(String email);
}
