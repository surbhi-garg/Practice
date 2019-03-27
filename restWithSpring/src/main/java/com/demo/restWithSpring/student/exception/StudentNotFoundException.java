package com.demo.restWithSpring.student.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message)
    {
        super(message);
    }
}
