package com.apitest.testing.Controller;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Skill;
import com.apitest.testing.Services.SkillService;

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
public class SkillController {
    @Autowired
    SkillService skillService;

    @GetMapping("/skill/list")
    public List<Skill> showAll() {
        return skillService.list_skill();
    }

    @PostMapping("/skill/create")
    public void create(@RequestBody Skill new_skill) {
        System.out.println(new_skill.toString());
        skillService.create_skill(new_skill);
    }

    @DeleteMapping("/skill/erase")
    public void delete(@RequestBody DeleterLong id_skill) {
        System.out.println(id_skill);
        System.out.println(id_skill.getId());
        skillService.delete_skill(id_skill);
    }

    @PutMapping("/skill/update")
    public void update(@RequestBody Skill new_skill) {
        skillService.update_skill(new_skill);
    }

    @PostMapping("/skill/info")
    @ResponseBody
    public List<Skill> get_educations(@RequestBody Deleter id_skill) {
        return skillService.get_skill(id_skill.getId());
    }
}
