package com.apitest.testing.Services;

import java.util.List;

import javax.transaction.Transactional;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Education;
import com.apitest.testing.Repository.EducationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationService implements IEducationService {

    @Autowired
    EducationRepository eduRepo;
    
    @Override
    public void create_education(Education new_education) {
        eduRepo.save(new_education);
    }

    @Override
    public void update_education(Education education) {
        eduRepo.save(education);
    }

    @Override
    public void delete_education(Deleter id_education) {
        eduRepo.deleteByIdEducation(id_education.getId());
    }

    @Override
    public List<Education> list_education() {
    
        return (List<Education>) eduRepo.findAll();
    }

    @Override
    public List<Education> get_education(Long id_user) {
        return eduRepo.findAllByidUser(id_user);
    }
    
}
