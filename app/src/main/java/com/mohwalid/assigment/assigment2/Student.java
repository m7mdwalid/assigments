package com.mohwalid.assigment.assigment2;

public class Student {

    private String name;
    private String level;
    private String age;
    private String degree;

    public Student(String name, String level, String age, String degree) {
        this.name = name;
        this.level = level;
        this.age = age;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getAge() {
        return age;
    }

    public String getDegree() {
        return degree;
    }
}
