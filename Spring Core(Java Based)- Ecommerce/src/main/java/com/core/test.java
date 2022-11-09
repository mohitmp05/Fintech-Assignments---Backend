package com.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext con = new AnnotationConfigApplicationContext(configure.class);
        Users_Details d1 = con.getBean(Users_Details.class);

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name:-");
        d1.setName(s1.next());
        System.out.println("Enter mobile:-");
        d1.setMobile(s1.nextLong());

        System.out.println("Enter hno:-");
        String hno = s1.next();
        System.out.println("Enter area:-");
        String area = s1.next();
        System.out.println("Enter city:-");
        String city = s1.next();
        System.out.println("Enter state:-");
        String state = s1.next();
        System.out.println("Enter pincode:-");
        int pincode = s1.nextInt();

        d1.setAddress(new Address(hno,area,city,state,pincode));

        System.out.println("Press 1 to shop and 2 to exit:");
        int i = s1.nextInt();

        switch (i){
            case 1 ->{
                Map<Integer,String> product= new HashMap<>();
                product.put(1,"Books");
                product.put(2,"Fruits");
                product.put(3,"Vegetables");
                product.put(4,"Electronics");

                for(Map.Entry m : product.entrySet()){
                    System.out.println(m.getKey()+" "+m.getValue());
                }

                System.out.println("Press the corresponding id of the product to shop.");
                int j = s1.nextInt();
                switch (j){
                    case 1->{
                        d1.setProduct(new Product_details(1,product.get(1),"500"));
                    }
                    case 2->{
                        d1.setProduct(new Product_details(2,product.get(2),"250"));
                    }
                    case 3->{
                        d1.setProduct(new Product_details(3,product.get(3),"700"));
                    }
                    case 4->{
                        d1.setProduct(new Product_details(4,product.get(4),"800"));
                    }
                }
            }
            case 2 ->{
                System.out.println("Come back again");
            }

        }
        System.out.println(d1);
        con.registerShutdownHook();
    }
}
