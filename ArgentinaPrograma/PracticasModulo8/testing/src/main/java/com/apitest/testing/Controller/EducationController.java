package com.apitest.testing.Controller;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Education;
import com.apitest.testing.Services.EducationService;

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
public class EducationController {
    @Autowired
    EducationService educationService;

    @GetMapping("/education/list")
    public List<Education> showAll() {
        return educationService.list_education();
    }

    @PostMapping("/education/create")
    public void create(@RequestBody Education new_education) {
        educationService.create_education(new_education);
    }

    @DeleteMapping("/education/erase")
    public void delete(@RequestBody Deleter id_education) {
        // System.out.println(id_education.getId());
        educationService.delete_education(id_education);
    }

    @PutMapping("/education/update")
    public void update(@RequestBody Education new_education) {
        educationService.update_education(new_education);
    }

    @PostMapping("/edcuation/info")
    @ResponseBody
    public List<Education> get_educations(@RequestBody Deleter id_education) {
        return educationService.get_education(id_education.getId());
    }

}
