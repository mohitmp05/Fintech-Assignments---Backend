package com.core;

public class Bank {

    private int acc;
    private String name;

    public Bank() {
        super();
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank(int acc, String name) {
        this.acc = acc;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "acc=" + acc +
                ", name='" + name + '\'' +
                '}';
    }
}
