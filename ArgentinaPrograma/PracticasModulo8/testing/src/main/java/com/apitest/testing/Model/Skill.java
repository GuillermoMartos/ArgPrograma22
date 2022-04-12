package com.apitest.testing.Model;

import javax.persistence.Entity;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idSkill;
    @Basic
    @Column(name = "title",nullable = false)
    String title;
    String about_skill;
    String type;
    Number qualification;
    @Column(name = "idUser",nullable = false)
    Long idUser;
    
    public Skill() {
    }

    public Skill(Long idSkill, String type, String title, String about_skill, Number qualification, Long idUser) {
        this.idSkill = idSkill;
        this.title = title;
        this.about_skill = about_skill;
        this.qualification = qualification;
        this.idUser = idUser;
        this.type = type;
    }

    public Skill(String type) {
        this.type = type;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout_skill() {
        return about_skill;
    }

    public void setAbout_skill(String about_skill) {
        this.about_skill = about_skill;
    }

    public Number getQualification() {
        return qualification;
    }

    public void setQualification(Number qualification) {
        this.qualification = qualification;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    
    
    
}
