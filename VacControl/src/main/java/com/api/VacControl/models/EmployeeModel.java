package com.api.VacControl.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Firstname;
    private String Lastname;
    private int Status_Id;
    private int age;
    private String Position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getStatus_Id() {
        return Status_Id;
    }

    public void setStatus_Id(int status_Id) {
        Status_Id = status_Id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return Position;
    }



    public void setPosition(String position) {
        Position = position;
    }

}
