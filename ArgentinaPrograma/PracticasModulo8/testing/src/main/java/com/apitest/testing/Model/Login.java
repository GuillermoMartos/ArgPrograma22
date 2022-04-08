package com.apitest.testing.Model;

public class Login {
    String password;
    String email;
    public Login() {
    }
    public Login(String password, String email) {
        this.password = password;
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
