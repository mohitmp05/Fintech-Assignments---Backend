package com.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class configure {

    @Bean
    @Scope(value = "singleton")
    public Users_Details user(){
        return new Users_Details();
    }
    @Bean
    public Product_details product(){
        return new Product_details();
    }
    @Bean
    public Address address(){
        return new Address();
    }
}
