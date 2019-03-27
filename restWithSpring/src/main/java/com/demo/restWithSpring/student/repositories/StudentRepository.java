package com.demo.restWithSpring.student.repositories;

import com.demo.restWithSpring.student.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
    Student findByName(String name);
}
