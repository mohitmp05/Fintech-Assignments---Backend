package com.admission.controller.form;

public class AdmissionForm {
    private String name;
    private int age;
    private int std;
    private String gender;
    private String mobile;

    public AdmissionForm() {
        super();
    }

    public AdmissionForm(String name, int age, int std, String gender, String mobile) {
        this.name = name;
        this.age = age;
        this.std = std;
        this.gender = gender;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
