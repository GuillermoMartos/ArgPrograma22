package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Skill;
import com.apitest.testing.Repository.SkillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

    @Autowired
    SkillRepository skillRepo;

    @Override
    public void create_skill(Skill new_skill) {
        skillRepo.save(new_skill);
        
    }

    @Override
    public void update_skill(Skill skill) {
        skillRepo.save(skill);
        
    }

    @Override
    public void delete_skill(Deleter id_skill) {
        skillRepo.deleteByIdSkill(id_skill.getId());
        
    }

    @Override
    public List<Skill> list_skill() {
        return (List<Skill>) skillRepo.findAll();
    }

    @Override
    public List<Skill> get_skill(Long id_user) {
        return skillRepo.findAllByidUser(id_user);
        
    }
    
}
