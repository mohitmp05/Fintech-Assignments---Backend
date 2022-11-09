package com.food.dao;

import com.food.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {

    Customer findByEmail(String email);

    boolean existsByEmail(String email);
}
