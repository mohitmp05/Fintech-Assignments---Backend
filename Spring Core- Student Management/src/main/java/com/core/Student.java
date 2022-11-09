package com.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    int id;
    String sname;

    @Autowired
    Address add;
    @Autowired
    Payment pay;
    @Autowired
    Result res;
    @Autowired
    Addmission stat;

    public Student() {
        super();
    }

    public Student(int id, String sname, Address add, Payment pay, Result res, Addmission stat) {
        this.id = id;
        this.sname = sname;
        this.add = add;
        this.pay = pay;
        this.res = res;
        this.stat = stat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public Result getRes() {
        return res;
    }

    public void setRes(Result res) {
        this.res = res;
    }

    public Addmission getStat() {
        return stat;
    }

    public void setStat(Addmission stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", add=" + add +
                ", pay=" + pay +
                ", res=" + res +
                ", stat=" + stat +
                '}';
    }
}
