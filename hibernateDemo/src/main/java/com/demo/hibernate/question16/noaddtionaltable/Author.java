package com.demo.hibernate.question16.noaddtionaltable;

import com.demo.hibernate.Address;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "author3")
public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    @Transient
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dob;


    @Embedded
    Address address;

    @ElementCollection
    List<String> subjectList = new ArrayList<String>();

    //Question16-->oneToMany--unidrectional
    @OneToMany(mappedBy = "author")
    Set<Book> bookSet = new HashSet<Book>();

    public Author() {
    }

    public Author(String firstName, String lastName, Integer age, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
    }

    public Author(Integer id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                ", subjectList=" + subjectList +
                ", bookSet=" + bookSet +
                '}';
    }
}


