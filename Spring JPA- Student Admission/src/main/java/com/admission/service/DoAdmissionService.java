package com.admission.service;

import com.admission.controller.form.AdmissionForm;
import com.admission.model.Admission;
import com.admission.model.Student;
import com.admission.repository.AdmissionRepository;
import com.admission.repository.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DoAdmissionService {
    @Autowired
    private AdmissionRepository admissionRepo;
    @Autowired
    private StudentRepository studentRepo;

    public String doAdmission(@RequestBody AdmissionForm admissionForm){
        Student student = new ObjectMapper().convertValue(admissionForm,Student.class);
        Long id = studentRepo.save(student).getId();
        System.out.println("Student details saved");

        Admission admission = new Admission(id,new Date(System.currentTimeMillis()),"CBSE");
        Long admissionNumber = admissionRepo.save(admission).getAdmissionNumber();

        return "Admission Done " + admissionNumber;
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepo.findById(id).orElse(null);
    }

    public String deleteStudent(Long id){
        studentRepo.deleteById(id);
        admissionRepo.deleteById(id+1);
        return "Student Removed and Admission Cancelled";
    }

    public Student updateStudent(Student student){
        Student existingStudent = studentRepo.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setStd(student.getStd());
        existingStudent.setGender(student.getGender());
        existingStudent.setMobile(student.getMobile());
        return studentRepo.save(existingStudent);
    }
}
