package com.testtransaction.Controller.form;

public class Form {

    private String Name;
    private String Gender;
    private String Mobile;
    private int age;

    public Form() {
        super();
    }

    public Form(String name, String gender, String mobile, int age) {
        Name = name;
        Gender = gender;
        Mobile = mobile;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
