package com.apitest.testing.Repository;

import java.util.List;

import com.apitest.testing.Model.Skill;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository <Skill, Long>{
    List<Skill> findAllByidUser(Number idUser);
    void deleteByIdSkill(Long idSkill);
    
    // List<Education> findAllByidUser(Number id_user);
    // void deleteByIdEducation(Long number);
}
