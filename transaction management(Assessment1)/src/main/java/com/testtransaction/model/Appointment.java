package com.testtransaction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentNumber;
    private Date date;
    private String doctorName;
    private Long PatientNumber;

    public Appointment() {
        super();
    }

    public Appointment(Date date, String doctorName, Long patientNumber) {
        this.date = date;
        this.doctorName = doctorName;
        PatientNumber = patientNumber;
    }

    public Long getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(Long appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Long getPatientNumber() {
        return PatientNumber;
    }

    public void setPatientNumber(Long patientNumber) {
        PatientNumber = patientNumber;
    }
}
