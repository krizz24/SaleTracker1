package com.example.saletracker1.pojo;

public class RegisterRequest {

    String companyName;
    String ownerName;
    String address;
    String phone;
    String email;
    String password;


    public RegisterRequest(String companyName, String ownerName,
                           String address, String phone, String email,
                           String password) {

        this.companyName = companyName;
        this.ownerName = ownerName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
