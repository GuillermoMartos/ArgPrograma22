package com.apitest.testing.Services;

import java.util.List;

import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Job;

public interface IJobService {
    public void create_job(Job new_job);
    public void update_job(Job job);
    public void delete_job(DeleterLong id_job);
    public List<Job> list_job();
    public List<Job> get_job(Number id_user);

}   
