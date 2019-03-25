package com.demo.springData;

import com.demo.springData.config.PersistenceContext;
import com.demo.springData.Person.entities.Person;
import com.demo.springData.Person.service.PersonService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);

        PersonService personService = context.getBean(PersonService.class);

        Person person = new Person("Surbhi", "Garg", 40000, 23);

        List<Person> personList = Arrays.asList(new Person("Abhinav", "Shrivastav", 70000, 28),
                new Person("Gagan", "Kushwaha", 40000, 23));

        System.out.println("*********Question3******************");

        System.out.println("Saved person with following details: " + personService.save(person));

        System.out.println("Saved list of following persons: " + personService.save(personList));

        System.out.println("Person with id 1 is: " + personService.findOne(1));

        System.out.println("Person with id 1 exists? " + personService.exists(1));

        System.out.println("All persons in database: " + personService.findAll());

        System.out.println("Count of persons: " + personService.count());

        personService.delete(2);
        System.out.println("After deleting person with id 2" + personService.findAll());

        personService.delete(person);
        System.out.println("After deleting person object: " + personService.findAll());

        personService.delete(personList);
        System.out.println("After deleting personList: " + personService.findAll());

        personService.save(person);
        personService.save(personList);
        personService.deleteAll();
        System.out.println("After saving again and deleteAll(): " + personService.findAll());

        System.out.println("*********Question5******************");
        personService.save(person);
        personService.save(personList);
        System.out.println(personService.findAll());

        System.out.println("Result of findByFirstName(Surbhi): " + personService.findByFirstName("Surbhi"));
        System.out.println("Result of findByLastName(Shrivastav): " + personService.findByLastName("Shrivastav"));
        System.out.println("Result of findById(3): " + personService.findById(10));

        System.out.println("*********Question6******************");
        Person person2 = new Person("Aakash", "Garg", 65000, 25);
        personService.save(person2);

        Person person3 = new Person("Srishti", "Singhal", 65000, 25);
        personService.save(person3);

        System.out.println("FirstName of person with age 25: " + personService.getFirstNamesByAge(25));

        System.out.println("*********Question7******************");
        System.out.println("FirstNames and LastNames of person with age 25: ");
        personService.getFirstNamesAndLastNamesByAge(25).forEach(ele -> System.out.println(Arrays.toString(ele)));

        System.out.println("*********Question8******************");
        System.out.println("Persons with age 25: "+personService.getPersonsByAge(25));

        System.out.println("*********Question9******************");
        Person person1=new Person("Peter","Parker",50000,22);
        personService.save(person1);
        System.out.println("Count of persons with firtName=Peter: "+personService.countPersonByFirstName("Peter"));

        System.out.println("*********Question10******************");
        Person person4=new Person("Peter","William",50000,35);
        personService.save(person4);

        System.out.println("Current Users");
        personService.findAll().forEach(System.out::println);

        System.out.println("countByAge(25); "+personService.countByAge(25));

        System.out.println("countDistinctByFirstName()"+personService.countDistinctByFirstName("Peter"));

        System.out.println("findByLastNameOrAge(Garg,25): "+personService.findByLastNameOrAge("Garg",25));

        System.out.println("findByLastNameAndAge(Garg,25): "+personService.findByLastNameAndAge("Garg",25));

        System.out.println("findByAgeBetween(20,22): "+personService.findByAgeBetween(20,22));

        System.out.println("findByAgeLessThan(23): "+personService.findByAgeLessThan(23));

        System.out.println("findByAgeGreaterThan(23): "+personService.findByAgeGreaterThan(23));

        System.out.println("findByFirstNameLike(__r%): "+personService.findByFirstNameLike("__r%"));

        System.out.println("findBySalaryNot(50000): "+personService.findBySalaryNot(50000));

        System.out.println("findBySalaryIn(Arrays.asList(40000,50000)): "+personService.findBySalaryIn(Arrays.asList(40000,50000)));

        System.out.println("findByFirstNameIgnoreCase(Peter): "+personService.findByFirstNameIgnoreCase("peter"));

        System.out.println("*********Question11******************");
        System.out.println("findByAgeGreaterThanOrderByIdDesc(23): "+personService.findByAgeGreaterThanOrderByIdDesc(23));

        System.out.println("*********Question12******************");
        System.out.println("findByAgeGreaterThan(23,new Sort(Sort.Direction.DESC)): "+personService.findByAgeGreaterThan(23,new Sort(Sort.Direction.DESC,"id")));

        System.out.println("*********Question13******************");
        System.out.println("Current Users");
        personService.findAll().forEach(System.out::println);
        System.out.println("Pagination (0th page, 3 records)");
        personService.findAll(new PageRequest(0,3)).getContent().forEach(System.out::println);

    }
}
