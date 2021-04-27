package com.swaggerdemo.swaggerdemo.model;

public class Student {
    public Integer id;
    private String name;
    private String cls;
    private String country;

    public Student(Integer id, String name, String cls, String country) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCls() {
        return cls;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
    }
}

