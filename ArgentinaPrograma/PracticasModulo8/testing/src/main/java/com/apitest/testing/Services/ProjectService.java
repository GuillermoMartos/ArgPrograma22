package com.apitest.testing.Services;

import java.util.List;

import javax.transaction.Transactional;

import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Project;
import com.apitest.testing.Repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjectService implements IProjectService {

    @Autowired
    ProjectRepository projectRepo;
    
    @Override
    public void create_project(Project new_project) {
        projectRepo.save(new_project);
    }

    @Override
    public void update_project(Project project) {
        projectRepo.save(project);
    }

    @Override
    public void delete_project(DeleterLong id_project) {
        projectRepo.deleteByIdProject(id_project.getId());
        
    }

    @Override
    public List<Project> list_project() {
        return (List<Project>) projectRepo.findAll();
    }

    @Override
    public List<Project> get_project(Number number) {
        return projectRepo.findAllByidUser(number);
    }
    
}
