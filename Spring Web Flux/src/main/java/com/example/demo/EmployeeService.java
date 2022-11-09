package com.example.demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

	Mono<Emp> getEmployeeById(int id);

	Flux<Emp> getAllEmployees();

	Mono<Emp> save(Emp emp);

	Mono<Void> deleteById(int id);

}