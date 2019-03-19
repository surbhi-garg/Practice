package com.demo.hibernate.question13;

import com.demo.hibernate.Address;
import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Address address=new Address();
        address.setLocation("Vashisht Park");
        address.setState("Delhi");
        address.setStreetNumber(4);

        Author author=new Author("Surbhi","Garg",23,new Date());
        author.setAddress(address);
        author.setSubjectList(Arrays.asList("Science","Java","Maths"));

        Author author1=new Author("Kalpna","Sagar",35,new Date());
        author1.setAddress(address);
        author1.setSubjectList(Arrays.asList("Hindi","C++","Spring"));

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(author);
        session.save(author1);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

