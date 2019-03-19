package com.demo.hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//added annotations to mark it as Hibernate Entity, required for Q2 onwards
//added @Column for Question6
@Entity
public class Author {
    @Id
    @Column(name = "id")
    //question9-->identity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //qestion9-->table
//   @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    //for Question7
    @Transient
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name="date_of_birth")
    //added field for question3
    //forQuestion8-@Temporal
    @Temporal(TemporalType.DATE)
    private Date dob;

    //Question11
    @Embedded
    Address address;

    //Question12 and 13
    @ElementCollection
    List<String>subjectList=new ArrayList<String>();

    //Question15
    @OneToOne
    @JoinColumn(name = "book_id")
    Book book;

    public Author(){}
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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
               ", book=" + book +
                '}';
    }
}
