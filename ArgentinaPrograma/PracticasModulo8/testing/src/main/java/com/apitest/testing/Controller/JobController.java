package com.apitest.testing.Controller;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Job;
import com.apitest.testing.Services.JobService;

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
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("/job/list")
    public List<Job> showAll() {
        return jobService.list_job();
    }

    @PostMapping("/job/create")
    public void create(@RequestBody Job new_job) {
        jobService.create_job(new_job);
    }

    @DeleteMapping("/job/erase")
    public void delete(@RequestBody DeleterLong id_job) {
        jobService.delete_job(id_job);
    }

    @PutMapping("/job/update")
    public void update(@RequestBody Job new_job) {
        jobService.update_job(new_job);
    }

    @PostMapping("/job/info")
    @ResponseBody
    public List<Job> get_educations(@RequestBody Deleter id_job) {
        return jobService.get_job(id_job.getId());
    }
}
