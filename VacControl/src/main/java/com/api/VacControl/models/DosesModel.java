package com.api.VacControl.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "doses")
public class DosesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long Employee_Id;
    private int Vaccine_Id;
    private int Dose_number;
    private Date First_dose;
    private Date Second_dose;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployee_Id() {
        return Employee_Id;
    }

    public void setEmployee_Id(Long employee_Id) {
        Employee_Id = employee_Id;
    }

    public int getVaccine_Id() {
        return Vaccine_Id;
    }

    public void setVaccine_Id(int vaccine_Id) {
        Vaccine_Id = vaccine_Id;
    }

    public int getDose_number() {
        return Dose_number;
    }

    public void setDose_number(int dose_number) {
        Dose_number = dose_number;
    }

    public Date getFirst_dose() {
        return First_dose;
    }

    public void setFirst_dose(Date first_dose) {
        First_dose = first_dose;
    }

    public Date getSecond_dose() {
        return Second_dose;
    }

    public void setSecond_dose(Date second_dose) {
        Second_dose = second_dose;
    }
}
