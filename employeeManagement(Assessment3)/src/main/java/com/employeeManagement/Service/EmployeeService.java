package com.employeeManagement.Service;

import com.employeeManagement.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {
        return Stream.of(new Employee(1,"Mohit",21,"Developer"),
                new Employee(2,"Aakash",23,"UI"),
                new Employee(3,"Ashish",22,"UX"),
                new Employee(4,"Aditi",26,"HR"))
                .collect(Collectors.toList());
    }
}
