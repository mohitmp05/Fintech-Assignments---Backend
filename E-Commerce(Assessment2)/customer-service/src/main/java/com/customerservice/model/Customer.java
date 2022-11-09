package com.customerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @Column(name = "USERNAME", unique = true, columnDefinition = "VARCHAR(64)")
    private String username;
    private String password;
    private String cname;
    private String phone;

    public Customer() {
    }

    public Customer(String username, String password, String cname, String phone) {
        this.username = username;
        this.password = password;
        this.cname = cname;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



