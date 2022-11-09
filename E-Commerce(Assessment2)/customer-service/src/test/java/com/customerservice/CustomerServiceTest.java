package com.customerservice;

import com.customerservice.dao.CustomerRepository;
import com.customerservice.service.CustomUserDetailService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

public class CustomerServiceTest {
    @Mock
    private CustomerRepository repository;

    private CustomUserDetailService customerService;

    @BeforeEach
    void setUp()
    {
        this.customerService
                = new CustomUserDetailService(this.repository);
    }

    @Test
    void getAllCustomers()
    {
        customerService.getAllCustomer();
        verify(repository).findAll();
    }
}
