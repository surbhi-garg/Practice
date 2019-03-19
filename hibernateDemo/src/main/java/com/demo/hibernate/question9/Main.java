package com.demo.hibernate.question9;

import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Author author=new Author("Surbhi","Garg",23,new Date());

    Author author1=new Author("Kalpna","Sagar",35,new Date());

    Author author2=new Author("Robert","Willson",30,new Date());

    Author author3=new Author("J.P.","Singh",40,new Date());

    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

    Session session=sessionFactory.openSession();
        session.beginTransaction();

            session.save(author);
            session.save(author1);
            session.save(author2);
            session.save(author3);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
