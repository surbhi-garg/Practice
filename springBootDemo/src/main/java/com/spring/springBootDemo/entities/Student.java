package com.spring.springBootDemo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

//added annotations for question7
@Entity
public class Student {
    @Id
    private int rollNumber;
    private String name;
    private String course;

    public Student() {
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }
}
