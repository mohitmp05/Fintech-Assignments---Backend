package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Loan {
    int amount;
    int roi;
    int time;
    float interest;
    String loantype;


    void eligibility(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int sal = sc.nextInt();
        System.out.println("Enter your Cibil Score");
        int cibil = sc.nextInt();
        System.out.println("Enter your account age in months");
        int month = sc.nextInt();

        System.out.println("Enter your duration of work in current company");
        int month1=sc.nextInt();

                if(sal<30000 || cibil<500){
                    System.out.println("Sorry your salary is too low.");
                }
                else {
                    if ((sal > 30000 && sal <= 60000) && month >= 6 && cibil > 500 && month1 >= 6) {
                        System.out.println("You are eligible for the loan of upto 5lakhs ");
                    }
                    else if ((sal>60000 && sal <=100000) && month >= 6 && cibil > 500 && month1 >= 6) {
                        System.out.println("You are eligible for the loan of upto 20Lakhs");
                    } else if (sal > 100000 && month >= 6 && cibil > 700 && month1 >= 6) {
                        System.out.println("your are eligible for upto 50Lakhs loan");
                    } else {
                        System.out.println("Not eligible");
                    }
                }
    }

    float interest(){
        interest = (amount*roi*time)/100;
        System.out.println("The total interest on the "+loantype+" loan of RS "+amount+" is "+interest);
        return interest;
    }

    float emi(){
        float emi = (amount+interest)/time;
        float emi_m= emi/12;
        System.out.println("The monthly emi for the loan would be: "+emi_m);
        return emi_m;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Bank account No-");
        long BankAccount = s1.nextLong();
        Loan n1 = new Loan();
        n1.eligibility();
        System.out.println("Enter Loan Amount-");
        n1.amount = s1.nextInt();
        n1.roi = 8;
        System.out.println("Enter Time-");
        n1.time = s1.nextInt();
        System.out.println("Enter Loan Type");
        n1.loantype = s1.next();

        n1.interest();

        String url = "jdbc:mysql://localhost:3306/loan";
        String username = "root";
        String pass = "12345";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();

        int x = st.executeUpdate("INSERT into loan_info values('"+BankAccount+"', '"+ n1.loantype+"', '"+n1.amount+"', '"+n1.emi()+"', '"+n1.time+"')");

        st.close();
        con.close();
    }
}
