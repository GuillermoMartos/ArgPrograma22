package com.apitest.testing.Model;

import javax.persistence.Entity;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idJob;
    @Basic
    @Column(name = "title",nullable = false)
    String title;
    @Column(name = "company",nullable = false)
    String company;
    String img;
    String about_job;
    @Column(name = "initial_date",nullable = false)
    String initial_date;
    String end_date;
    @Column(name = "idUser",nullable = false)
    Long idUser;

    public Job() {
    }
    
    public Job(Long idJob, String title, String company, String img, String about_job, String initial_date,
            String end_date, Long idUser) {
        this.idJob = idJob;
        this.title = title;
        this.company = company;
        this.img = img;
        this.about_job = about_job;
        this.initial_date = initial_date;
        this.end_date = end_date;
        this.idUser = idUser;
    }

    public Long getIdJob() {
        return idJob;
    }

    public void setIdJob(Long idJob) {
        this.idJob = idJob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAbout_job() {
        return about_job;
    }

    public void setAbout_job(String about_job) {
        this.about_job = about_job;
    }

    public String getInitial_date() {
        return initial_date;
    }

    public void setInitial_date(String initial_date) {
        this.initial_date = initial_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    
}


