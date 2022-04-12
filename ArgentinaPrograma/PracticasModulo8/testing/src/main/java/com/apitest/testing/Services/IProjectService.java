package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Project;

public interface IProjectService {
    public void create_project(Project new_project);
    public void update_project(Project project);
    public void delete_project(Deleter id_project);
    public List<Project> list_project();
    public List<Project> get_project(Long id_user);   
}
