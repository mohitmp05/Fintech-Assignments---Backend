package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Studentconfigure {

    @Bean
    public Student s1(){
        return new Student(1,"Mohit",add(),pay(),res(),stat());
    }
    @Bean
    public Address add(){
        return new Address("Lucknow","Uttar Pradesh");
    }
    @Bean
    public Payment pay(){
        return new Payment("Paid","Online",details());
    }
    @Bean
    public Bank details(){
        return new Bank(44646552,"AXIS Bank");
    }
    @Bean
    public Result res(){
        return new Result(486,92);
    }
    @Bean
    public Addmission stat(){
        return new Addmission(1201,"Offline");
    }
}
