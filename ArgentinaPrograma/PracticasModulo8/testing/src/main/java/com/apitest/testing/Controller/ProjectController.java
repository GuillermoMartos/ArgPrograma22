package com.apitest.testing.Controller;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Project;
import com.apitest.testing.Services.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "http://localhost:4200/" })
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/project/list")
    public List<Project> showAll() {
        return projectService.list_project();
    }

    @PostMapping("/project/create")
    public void create(@RequestBody Project new_project) {
        projectService.create_project(new_project);
    }

    @DeleteMapping("/project/erase")
    public void delete(@RequestBody Deleter id_project) {
        projectService.delete_project(id_project);
    }

    @PutMapping("/project/update")
    public void update(@RequestBody Project new_project) {
        projectService.update_project(new_project);
    }

    @PostMapping("/project/info")
    @ResponseBody
    public List<Project> get_projects(@RequestBody Deleter id_project) {
        return projectService.get_project(id_project.getId());
    }
}
