package com.javabased;

import org.springframework.beans.factory.annotation.Autowired;

public class Payment {
    private String stat;
    private String method;
    @Autowired
    private Bank details;

    public Payment() {
        super();
    }

    public Payment(String stat, String method, Bank details) {
        this.stat = stat;
        this.method = method;
        this.details = details;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Bank getDetails() {
        return details;
    }

    public void setDetails(Bank details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "stat='" + stat + '\'' +
                ", method='" + method + '\'' +
                ", details=" + details +
                '}';
    }
}
