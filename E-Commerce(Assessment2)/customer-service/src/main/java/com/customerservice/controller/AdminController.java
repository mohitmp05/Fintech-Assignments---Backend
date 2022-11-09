package com.customerservice.controller;

import com.customerservice.dao.CustomerRepository;
import com.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AdminController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/{username}")
    public String getName(@PathVariable String username){
        return customerRepository.findById(username).get().getCname();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody Customer customer) throws Exception{
        if(customerRepository.findById(customer.getUsername()).isPresent()){
            throw new Exception("Username already exists");
        }
        else {
            String pwd = customer.getPassword();
            String encryptedPwd = passwordEncoder.encode(pwd);
            customer.setPassword(encryptedPwd);
            customerRepository.save(customer);
            return "User Added Successfully";
        }
        }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody Customer customer) throws Exception{
        if(customerRepository.findById(customer.getUsername()).isPresent()){
            String pwd = customer.getPassword();
            String encryptedPwd = passwordEncoder.encode(pwd);
            customer.setPassword(encryptedPwd);
            customerRepository.save(customer);
            return "User updated successfully";
        }
        else {
            throw new Exception("User does not exist");
        }
    }

    @DeleteMapping("/delete/{username}")
    public String deleteCustomer(@PathVariable String username) throws Exception{
        if(customerRepository.findById(username).isPresent()){
            customerRepository.deleteById(username);
            return "User deleted Successfully";
        }
        else {
            throw new Exception("User does not exist");
        }
    }
}
