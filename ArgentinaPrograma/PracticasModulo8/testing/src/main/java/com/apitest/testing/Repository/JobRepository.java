package com.apitest.testing.Repository;

import java.util.List;

import com.apitest.testing.Model.Job;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository <Job, Number>{
    List<Job> findAllByidUser(Number idUser);
    void deleteByIdJob(Long idJob);
}
