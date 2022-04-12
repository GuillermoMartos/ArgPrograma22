package com.apitest.testing.Repository;

import java.util.List;

import com.apitest.testing.Model.Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository <Project, Number> {
    List<Project> findAllByidUser(Long idUser);
    void deleteByIdProject(Long idProject);
}
