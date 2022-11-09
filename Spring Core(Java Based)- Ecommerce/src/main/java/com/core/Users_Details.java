package com.core;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Users_Details implements InitializingBean, DisposableBean {
    private String name;
    private long mobile;
    private Address address;
    private Product_details product;

    public Users_Details() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Users_Details(String name, long mobile, Address address, Product_details product) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Product_details getProduct() {
        return product;
    }

    public void setProduct(Product_details product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Users_Details{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", address=" + address +
                ", product=" + product +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Order has been accepted and will be dispatched soon.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Welcome to Amazon");
    }
}
