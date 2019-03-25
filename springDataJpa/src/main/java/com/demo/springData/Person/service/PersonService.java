package com.demo.springData.Person.service;

import com.demo.springData.Person.entities.Person;
import com.demo.springData.Person.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

//    Question3-->Crud repository methods

    public Person save(Person person)
    {
       return personRepository.save(person);
    }

    public Iterable<Person>save(Iterable<Person> personIterable)
    {
        return personRepository.save(personIterable);
    }

    public Person findOne(Integer id)
    {
        return personRepository.findOne(id);
    }

    public boolean exists(Integer id)
    {
        return personRepository.exists(id);
    }

    public Iterable<Person> findAll()
    {
        return personRepository.findAll();
    }

    public Iterable<Person> findAll(Iterable<Integer>ids)
    {
        return personRepository.findAll(ids);
    }

    public long count()
    {
        return personRepository.count();
    }

    public void delete(Integer id)
    {
        personRepository.delete(id);
    }

    public void delete(Person person)
    {
        personRepository.delete(person);
    }
    public void delete(Iterable<Person> persons)
    {
        personRepository.delete(persons);
    }

    public void deleteAll()
    {
        personRepository.deleteAll();
    }

//    CrudRepository methods end here


    //Question5-->findByMethods
    public List<Person> findByFirstName(String firstName)
    {
        return personRepository.findByFirstName(firstName);
    }

    public List<Person>findByLastName(String lastName)
    {
        return personRepository.findByLastName(lastName);
    }
    public Person findById(Integer id)
    {
        return personRepository.findById(id);
    }

    //Question6
    public List<String> getFirstNamesByAge(Integer age)
    {
        return personRepository.getFirstNamesByAge(age);
    }

    //Question7
    public List<Object[]>getFirstNamesAndLastNamesByAge(Integer age)
    {
        return personRepository.getFirstNamesAndLastNamesByAge(age);
    }

    //Question8
    public List<Person>getPersonsByAge(Integer age)
    {
        return personRepository.getPersonsByAge(age);
    }

    //Question9
    public Integer countPersonByFirstName(String firstName)
    {
        return personRepository.countPersonByFirstName(firstName);
    }

    //Question10
    public Integer countByAge(int age)
    {
        return personRepository.countByAge(age);
    }
   public Integer countDistinctByFirstName(String firstName)
    {
        return personRepository.countDistinctByFirstName(firstName);
    }
   public List<Person>findByLastNameOrAge(String lastName,Integer age)
    {
        return personRepository.findByLastNameOrAge(lastName,age);
    }
    public List<Person>findByLastNameAndAge(String lastName,Integer age)
    {
        return personRepository.findByLastNameAndAge(lastName,age);
    }
   public List<Person>findByAgeBetween(Integer minimum,Integer maximum)
    {
        return personRepository.findByAgeBetween(minimum,maximum);
    }
    public List<Person>findByAgeLessThan(Integer bound)
    {
        return personRepository.findByAgeLessThan(bound);
    }
    public List<Person>findByAgeGreaterThan(Integer bound)
    {
        return personRepository.findByAgeGreaterThan(bound);
    }
    public List<Person>findByFirstNameLike(String pattern)
    {
        return personRepository.findByFirstNameLike(pattern);
    }
    public List<Person>findBySalaryNot(Integer salary)
    {
        return personRepository.findBySalaryNot(salary);
    }
   public List<Person>findBySalaryIn(List<Integer>salaries)
    {
        return personRepository.findBySalaryIn(salaries);
    }
    public List<Person>findByFirstNameIgnoreCase(String firstName)
    {
        return personRepository.findByFirstNameIgnoreCase(firstName);
    }

    //Question11
    public List<Person>findByAgeGreaterThanOrderByIdDesc(Integer bound)
    {
        return personRepository.findByAgeGreaterThanOrderByIdDesc(bound);
    }

    //Question12
   public List<Person>findByAgeGreaterThan(Integer bound, Sort sort)
    {
        return personRepository.findByAgeGreaterThan(bound,sort);
    }

    //Question13
    public Page<Person>findAll(Pageable pageable)
    {
        return personRepository.findAll(pageable);
    }


    public List<Person>findByNameIs(String firstName)
    {
        return personRepository.findByNameIs(firstName);
    }


    public List<Person>findByFirstNameOrderByIdDesc(String firstName)
    {
        return personRepository.findByFirstNameOrderByIdDesc(firstName);
    }


}

