package com.apitest.testing.Repository;

import java.util.UUID;

import com.apitest.testing.Model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, UUID> {
 
    
}
