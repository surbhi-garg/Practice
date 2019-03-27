package com.demo.restWithSpring.commons.events;

import com.demo.restWithSpring.student.Student;
import com.demo.restWithSpring.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Component
public class Bootstrap {

    @Autowired
    StudentService studentService;

    @EventListener(ContextRefreshedEvent.class)
    public void insertStudentData()
    {
        List<Student> studentList​=studentService.getStudentsList();
        if(studentList​.isEmpty())
        {
            System.out.println("In event");
            List<Student> studentListToBeSaved = Arrays.asList(new Student("Surbhi", 23), new Student("Vagish", 24), new Student("Reshma", 25));
            studentService.saveAll(studentListToBeSaved);
        }

    }
}
