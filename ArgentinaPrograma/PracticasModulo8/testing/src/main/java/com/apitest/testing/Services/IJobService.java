package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.Deleter;
import com.apitest.testing.Model.Job;

public interface IJobService {
    public void create_job(Job new_education);
    public void update_job(Job education);
    public void delete_job(Deleter id_education);
    public List<Job> list_job();
    public List<Job> get_job(Long id_user);

}
