package com.spring.springBootDemo.services;

import com.spring.springBootDemo.entities.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    Logger logger= LoggerFactory.getLogger(StudentService.class);
    public List<Student> getStudentsList()
    {
        //Question6
        logger.info(".........In studentService.getStudentsList() method...........");
        return Arrays.asList(
                new Student(1,"Surbhi","BCA"),
                new Student(2,"Reshma","MCA")
        );
    }
}
