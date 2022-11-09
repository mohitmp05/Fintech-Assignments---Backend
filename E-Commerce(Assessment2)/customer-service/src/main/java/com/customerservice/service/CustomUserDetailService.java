package com.customerservice.service;

import com.customerservice.dao.CustomerRepository;
import com.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> customer = repository.findById(username);
        CustomUserDetails userDetails = null;

        if(customer.isPresent()){
            userDetails = new CustomUserDetails();
            userDetails.setCustomer(customer);
        }
        else {
            throw new UsernameNotFoundException("User Doesn't exists!");
        }
        return userDetails;
    }

    public List<Customer> getAllCustomer()
    {
        return this.repository.findAll();
    }

    public CustomUserDetailService(CustomerRepository repository) {
        this.repository = repository;
    }
}
