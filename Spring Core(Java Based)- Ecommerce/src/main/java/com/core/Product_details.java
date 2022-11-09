package com.core;

public class Product_details {
    private int id;
    private String name;
    private String price;
    public Product_details() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Product_details(int id, String name, String price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product_details [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
