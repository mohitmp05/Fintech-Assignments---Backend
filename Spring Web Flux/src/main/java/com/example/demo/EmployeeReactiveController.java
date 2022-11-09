package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeReactiveController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Mono<Emp> getEmployee(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/get")
	public Flux<Emp> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PutMapping("/update")
	public Mono<Emp> update(@RequestBody Emp emp) {
		return employeeService.save(emp);
	}
	
	@PostMapping("/add")
	public Mono<Emp> saveNew(@RequestBody Emp emp) {
		return employeeService.save(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<Void> deleteById(@PathVariable int id) {
		return employeeService.deleteById(id);
	}

}
