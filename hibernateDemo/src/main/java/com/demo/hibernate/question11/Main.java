package com.demo.hibernate.question11;

import com.demo.hibernate.Address;
import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Author author=new Author("Surbhi","Garg",23,new Date());

        Address address=new Address();
        address.setLocation("Vashisht Park");
        address.setState("Delhi");
        address.setStreetNumber(4);

        author.setAddress(address);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session=sessionFactory.openSession();

        session.beginTransaction();

            session.save(author);

        session.getTransaction().commit();
    }
}
