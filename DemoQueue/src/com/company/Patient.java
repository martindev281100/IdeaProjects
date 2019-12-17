package com.company;

public class Patient {
    private String name;
    private int age;

    public Patient(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "Name: "+ name + ", age: "+age;
    }
}
