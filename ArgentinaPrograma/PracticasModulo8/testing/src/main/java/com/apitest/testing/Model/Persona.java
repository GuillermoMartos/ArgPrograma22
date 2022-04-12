package com.apitest.testing.Model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



// import lombok.Getter;
// import lombok.Setter;



@Entity  
// @Getter @Setter
public class Persona{
   
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long user_id;
    @Basic
    @Column(name = "name",nullable = false)
    String name;
    @Column(name = "password",nullable = false)
    String password;
    String position;
    String about;
    String adress;
    String phone;
    @Column(name = "email",nullable = false)
    String email;
    String img;
    
    

    public Persona() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
 
    public Persona(Long user_id, String name, String password, String position, String about, String adress,
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
