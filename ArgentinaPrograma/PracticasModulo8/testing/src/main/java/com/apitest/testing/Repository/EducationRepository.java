package com.apitest.testing.Repository;

import java.util.List;

import com.apitest.testing.Model.Education;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends CrudRepository <Education, Number>{

    List<Education> findAllByidUser(Number id_user);
    void deleteByIdEducation(Long number);
}
