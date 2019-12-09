package com.example.api_integration.model;

public class EmployeeCUD {
    private int id, age;
    private float salary;
    private String name;
    private String profile_image;

    public EmployeeCUD(int age, float salary, String name) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.profile_image = profile_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }




}
