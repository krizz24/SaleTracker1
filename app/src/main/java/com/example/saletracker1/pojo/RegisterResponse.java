package com.example.saletracker1.pojo;

public class RegisterResponse {

    private Boolean status;
    private String message;
    private  Integer uid;


    public Boolean getStatus() { return status; }

    public String getMessage() { return message; }

    public Integer getUid() { return uid; }


    public void setStatus(Boolean status) { this.status = status; }

    public void setMessage(String message) { this.message = message; }

    public void setUid(Integer uid) { this.uid = uid; }

}
