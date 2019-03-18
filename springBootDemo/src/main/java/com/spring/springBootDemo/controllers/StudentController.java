package com.spring.springBootDemo.controllers;

import com.spring.springBootDemo.entities.Student;
import com.spring.springBootDemo.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    Logger logger= LoggerFactory.getLogger(StudentController.class);
    @RequestMapping("/getStudents")
    public List<Student> getStudentsList()
    {
        //Question6
        logger.info("............Calling studentService.getStudentsList().................");
        return studentService.getStudentsList();
    }
}
