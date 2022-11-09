package com.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(Studentconfigure.class);
        com.javabased.Student st = con.getBean(Student.class);
        System.out.println(st);
    }
}
