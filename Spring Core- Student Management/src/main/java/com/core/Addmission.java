package com.core;

public class Addmission {
    private int id;
    private String mode;

    public Addmission() {
        super();
    }

    public Addmission(int id, String mode) {
        this.id = id;
        this.mode = mode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Addmission{" +
                "id=" + id +
                ", mode='" + mode + '\'' +
                '}';
    }
}
