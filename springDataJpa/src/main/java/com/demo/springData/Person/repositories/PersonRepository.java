package com.demo.springData.Person.repositories;

import com.demo.springData.Person.entities.Person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {

    //Question4
    Person findById(Integer id);
    List<Person>findByFirstName(String firstName);
    List<Person>findByLastName(String lastName);

    //Question6
    @Query("select firstName from Person where  age=:age")
    List<String> getFirstNamesByAge(@Param("age") Integer age);

    //Question7
    @Query("select firstName,lastName from Person  where age=:age")
    List<Object[]>getFirstNamesAndLastNamesByAge(@Param("age")Integer age);

    //Question8
    @Query("select p from Person p where age=:age")
    List<Person>getPersonsByAge(@Param("age")Integer age);

    //Question9
    @Query("select count(p) from Person p where firstName=:firstName")
    Integer countPersonByFirstName(@Param("firstName")String firstName);

    //Question10
    Integer countByAge(int age);
    Integer countDistinctByFirstName(String firstName);
    List<Person>findByLastNameOrAge(String lastName,Integer age);
    List<Person>findByLastNameAndAge(String lastName,Integer age);
    List<Person>findByAgeBetween(Integer minimum,Integer maximum);
    List<Person>findByAgeLessThan(Integer bound);
    List<Person>findByAgeGreaterThan(Integer bound);
    List<Person>findByFirstNameLike(String pattern);
    List<Person>findBySalaryNot(Integer salary);
    List<Person>findBySalaryIn(List<Integer>salaries);
    List<Person>findByFirstNameIgnoreCase(String firstName);

    //Question11
    List<Person>findByAgeGreaterThanOrderByIdDesc(Integer bound);

    //Question12
    List<Person>findByAgeGreaterThan(Integer bound, Sort sort);

    //Question13
    Page<Person> findAll(Pageable pageable);



    List<Person>findByNameIs(@Param("firstName") String firstName);

    List<Person> findByFirstNameOrderByIdDesc(String firstName);




}
