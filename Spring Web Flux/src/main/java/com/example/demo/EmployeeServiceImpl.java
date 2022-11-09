package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Mono<Emp> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}
	
	@Override
	public Flux<Emp> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Mono<Emp> save(Emp emp) {
		return employeeRepository.save(emp);
	}
	
	@Override
	public Mono<Void> deleteById(int id) {
		return employeeRepository.deleteById(id);
	}
	
}
