package com.spring.springBootDemo.repositories;

import com.spring.springBootDemo.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
