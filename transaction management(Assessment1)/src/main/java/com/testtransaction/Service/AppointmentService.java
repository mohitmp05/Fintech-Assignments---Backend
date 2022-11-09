package com.testtransaction.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testtransaction.Controller.form.Form;
import com.testtransaction.model.Appointment;
import com.testtransaction.model.Patient;
import com.testtransaction.repository.AppointmentRepository;
import com.testtransaction.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepo;
    @Autowired
    private PatientRepository patientRepo;

    public String bookAppointment(@RequestBody Form appointmentForm) throws Exception{
        if(appointmentForm.getName()==null){
            throw new Exception("Name cannot be empty");
        } else if (appointmentForm.getGender()==null) {
            throw new Exception("Gender cannot be empty");
        } else if (appointmentForm.getMobile()==null) {
            throw new Exception("Mobile cannot be empty");
        } else if (appointmentForm.getAge()<=0) {
            throw new Exception("Enter valid age");
        }
        else {
            Patient pat = new ObjectMapper().convertValue(appointmentForm, Patient.class);
            Long patientNumber = patientRepo.save(pat).getPatientNumber();
            System.out.println("Patient saved successfully");

            Appointment appointment = new Appointment(new Date(System.currentTimeMillis()), "Dr Alok Gupta", patientNumber);
            Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();

            return "Appointment Confirmed and Appointment Id is" + appointmentNumber;
        }
    }

    public List<Patient> getPatients(){
        return patientRepo.findAll();
    }

    public ResponseEntity getPatientById(Long id) throws Exception{
        if(patientRepo.findById(id).isPresent()) {
            return ResponseEntity.ok(patientRepo.findById(id).orElse(null));
        }
        else{
            throw new Exception("Patient does not exist");
        }
    }

    public String deletePatientandAppointment(Long id){
        patientRepo.deleteById(id);
        appointmentRepo.deleteById(id);
        return "Patient and Appointment removed";
    }

    public String deleteAppointment(Long id){
        appointmentRepo.deleteById(id);
        return "Appointment removed";
    }

    public Patient updatePatient(Patient patient){
        return patientRepo.save(patient);
    }
}
