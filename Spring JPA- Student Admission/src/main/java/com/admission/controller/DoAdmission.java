package com.admission.controller;

import com.admission.controller.form.AdmissionForm;
import com.admission.model.Student;
import com.admission.service.DoAdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoAdmission {
    @Autowired
    private DoAdmissionService admissionService;

    @PostMapping("/add")
    public String doAdmission(@RequestBody AdmissionForm admissionForm){
        return admissionService.doAdmission(admissionForm);
    }

    @GetMapping("/get")
    public List<Student> findAllStudents(){
        return admissionService.getStudents();
    }

    @GetMapping("/get/{id}")
    public Student findStudentById(@PathVariable Long id){
        return admissionService.getStudentById(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return admissionService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return admissionService.deleteStudent(id);
    }
}
