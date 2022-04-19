package com.apitest.testing.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idEducation;
    String institution;
    String img_institution;
    @Column(name = "date_initial",nullable = false)
    String date_initial;
    String date_end;
    @Column(name = "title",nullable = false)
    String title;
    String about;
    @Column(name = "idUser",nullable = false)
    Number idUser;

    public Education() {
    }
    public Education(Long idEducation, String institution, String img_institution, String date_initial,
            String date_end, String title, String about, Number idUser) {
        this.idEducation = idEducation;
        this.institution = institution;
        this.img_institution = img_institution;
        this.date_initial = date_initial;
        this.date_end = date_end;
        this.title = title;
        this.about = about;
        this.idUser = idUser;
    }
    @Override
    public String toString() {
        return "Education [about=" + about + ", date_end=" + date_end + ", date_initial=" + date_initial
                + ", idEducation=" + idEducation + ", idUser=" + idUser + ", img_institution=" + img_institution
                + ", institution=" + institution + ", title=" + title + "]";
    }
    public Long getIdEducation() {
        return idEducation;
    }
    public void setIdEducation(Long idEducation) {
        this.idEducation = idEducation;
    }
    public String getInstitution() {
        return institution;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    public String getImg_institution() {
        return img_institution;
    }
    public void setImg_institution(String img_institution) {
        this.img_institution = img_institution;
    }
    public String getDate_initial() {
        return date_initial;
    }
    public void setDate_initial(String date_initial) {
        this.date_initial = date_initial;
    }
    public String getDate_end() {
        return date_end;
    }
    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public Number getIdUser() {
        return idUser;
    }
    public void setIdUser(Number id_user) {
        this.idUser = id_user;
    }

    
    
}
