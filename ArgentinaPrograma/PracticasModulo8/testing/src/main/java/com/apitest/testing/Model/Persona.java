package com.apitest.testing.Model;

import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue
    UUID user_id;
    @Basic
    String name;
    String password;
    String position;
    String about;
    String adress;
    String phone;
    String email;
    String img;
    
    public Persona() {
    }

    public Persona(UUID user_id, String name, String password, String position, String about, String adress,
            String phone, String email, String img) {
        this.user_id = user_id;
        this.name = name;
        this.password = password;
        this.position = position;
        this.about = about;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Persona [about=" + about + ", adress=" + adress + ", email=" + email + ", img=" + img + ", name=" + name
                + ", password=" + password + ", phone=" + phone + ", position=" + position + ", user_id=" + user_id
                + "]";
    }

}
