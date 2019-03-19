package com.demo.hibernate.question4;

import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Author author=new Author(1,"Surbhi","Garg",23);
        author.setDob(new Date());

        Author author1=new Author(2,"Kalpna","Sagar",35);
        author1.setDob(new Date());

        Author author2=new Author(3,"Robert","Willson",30);
        author2.setDob(new Date());

        Author author3=new Author(4,"J.P.","Singh",40);
        author3.setDob(new Date());

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
