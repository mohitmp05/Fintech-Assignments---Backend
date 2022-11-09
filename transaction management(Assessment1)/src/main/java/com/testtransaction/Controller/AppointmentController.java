package com.testtransaction.Controller;

import com.testtransaction.Controller.form.Form;
import com.testtransaction.Service.AppointmentService;
import com.testtransaction.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService bookAppointmentService;

    @PostMapping("/add")
    public String bookAppointment(@RequestBody Form appointmentForm){
        try {
            return bookAppointmentService.bookAppointment(appointmentForm);
        }catch(Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/get")
    public List<Patient> findAllPatients(){
        return bookAppointmentService.getPatients();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity findPatientById(@PathVariable Long id){
        try {
            return ResponseEntity.ok(bookAppointmentService.getPatientById(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }
    }

    @PutMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient){
        return bookAppointmentService.updatePatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePatientandAppointment(@PathVariable Long id){
        return bookAppointmentService.deletePatientandAppointment(id);
    }

    @DeleteMapping("/delete/appointment/{id}")
    public String deleteAppointment(@PathVariable Long id){
        return bookAppointmentService.deleteAppointment(id);
    }
}
