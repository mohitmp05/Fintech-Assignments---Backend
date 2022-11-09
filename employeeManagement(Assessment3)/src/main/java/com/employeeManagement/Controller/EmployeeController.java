package com.employeeManagement.Controller;

import com.employeeManagement.EmployeeManagementApplication;
import com.employeeManagement.Model.Employee;
import com.employeeManagement.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
            private EmployeeService employeeService;

    Logger logger = LoggerFactory.getLogger(EmployeeManagementApplication.class);

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        List<Employee> employees= employeeService.getEmployees();
        Employee employee = employees.stream().
                filter(e->e.getId()==id).findAny().orElse(null);
        if(employee!=null){
            logger.info("Employee found : {}",employee);
            return employee;
        }else{
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("Employee Not Found with ID : {}",id);
            }
            return new Employee();
        }
    }
}
