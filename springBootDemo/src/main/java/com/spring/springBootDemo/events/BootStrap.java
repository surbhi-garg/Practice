package com.spring.springBootDemo.events;

import com.spring.springBootDemo.repositories.StudentRepository;
import com.spring.springBootDemo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class BootStrap {
    @Autowired
    StudentRepository studentRepository;
    @EventListener(ContextRefreshedEvent.class)
    public void insertData()
    {
        Iterator<Student>studentIterator=studentRepository.findAll().iterator();
        if(!(studentIterator.hasNext()))
        {
            for(int i=0;i<5;i++)
            {
                Student student=new Student(i+1,"Student"+i,"MCA");
                studentRepository.save(student);
                System.out.println("student"+i+" created");
            }
        }
    }
}
