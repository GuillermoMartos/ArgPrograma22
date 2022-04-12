package com.apitest.testing.Model;

import javax.persistence.Entity;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idProject;
    @Basic
    @Column(name = "title",nullable = false)
    String title;
    @Column(name = "date",nullable = false)
    String date;
    @Column(name = "linkURL",nullable = false)
    String linkURL;
    String about_project;
    String img;
    @Column(name = "idUser",nullable = false)
    Long idUser;
    
    public Project() {
    }

    public Project(Long idProject, String title, String date, String linkURL, String about_project, String img,
            Long idUser) {
        this.idProject = idProject;
        this.title = title;
        this.date = date;
        this.linkURL = linkURL;
        this.about_project = about_project;
        this.img = img;
        this.idUser = idUser;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }

    public String getAbout_project() {
        return about_project;
    }

    public void setAbout_project(String about_project) {
        this.about_project = about_project;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    
}


