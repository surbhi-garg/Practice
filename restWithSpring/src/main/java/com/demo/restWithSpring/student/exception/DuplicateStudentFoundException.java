package com.demo.restWithSpring.student.exception;

public class DuplicateStudentFoundException extends RuntimeException {
    public DuplicateStudentFoundException(String message)
    {
        super(message);
    }
}
