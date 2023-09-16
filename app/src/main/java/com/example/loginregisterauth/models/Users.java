package com.example.loginregisterauth.models;

public class Users {
    private String Uid;
    private String email;
    private String password;

    public Users(){

    }

    public Users(String email, String password, String Uid){
        email = this.email;
        password = this.password;
        Uid=this.Uid;
    }

    public String getUid() {
        return Uid;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUid(String uid) {
        this.Uid = uid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
