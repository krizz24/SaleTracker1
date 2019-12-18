package com.example.saletracker1.pojo;

public class LoginRequest {

    String userName;
    String password;



    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public void setUserName(String userName) { this.userName = userName; }

    public void setPassword(String password) { this.password = password; }
}
