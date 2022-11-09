package com.testtransaction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PatientNumber;
    private String Name;
    private String Gender;
    private String Mobile;
    private int age;

    public Patient() {
        super();
    }

    public Patient(Long patientNumber, String name, String gender, String mobile, int age) {
        PatientNumber = patientNumber;
        Name = name;
        Gender = gender;
        Mobile = mobile;
        this.age = age;
    }

    public Long getPatientNumber() {
        return PatientNumber;
    }

    public void setPatientNumber(Long patientNumber) {
        PatientNumber = patientNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
