package com.apitest.testing.Services;

import java.util.List;

import javax.transaction.Transactional;

import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Job;
import com.apitest.testing.Repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JobService implements IJobService{

    @Autowired
    JobRepository jobRepo;

    @Override
    public void create_job(Job new_job) {
        jobRepo.save(new_job);
    }

    @Override
    public void update_job(Job job) {
        jobRepo.save(job);
    }

    @Override
    public void delete_job(DeleterLong id_job) {
        jobRepo.deleteByIdJob(id_job.getId());
    }

    @Override
    public List<Job> list_job() {
        return (List<Job>) jobRepo.findAll();
    }

    @Override
    public List<Job> get_job(Number number) {
        return jobRepo.findAllByidUser(number);
    }
    
}
