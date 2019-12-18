package com.example.saletracker1.employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String dOB;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String eId;


public Employee(String firstName, String lastName,String
        dOB,String gender,String address,String phone,
                String email,String password,String eId){

    this.firstName = firstName;
    this.lastName = lastName;
    this.dOB = dOB;
    this.gender = gender;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.password = password;
    this.eId = eId;
}

    public String geteId() { return eId; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getdOB() { return dOB; }

    public String getGender() { return gender; }

    public String getAddress() { return address; }

    public String getPhone() { return phone; }

    public String getEmail() { return email; }

    public String getPassword() { return password; }


    public void seteId(String eId) { this.eId = eId; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setdOB(String dOB) { this.dOB = dOB; }

    public void setGender(String gender) { this.gender = gender; }

    public void setAddress(String address) { this.address = address; }

    public void setPhone(String phone) { this.phone = phone; }

    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }
}

