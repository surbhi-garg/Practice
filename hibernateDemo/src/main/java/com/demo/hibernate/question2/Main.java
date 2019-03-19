package com.demo.hibernate.question2;

import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Author author=new Author(1,"Surbhi","Garg",23);
        Author author2=new Author(2,"Shivam","Khanna",22);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session=sessionFactory.openSession();

        session.beginTransaction();
        //create
        session.save(author);
        session.save(author2);
        //read
        Author author1=session.get(Author.class,1);
        System.out.println("Author with id 1: "+author1);
        //update
        author1.setFirstName("Sakshi");
        session.update(author1);
        Author author3=session.get(Author.class,1);
        System.out.println("Author with id 1 after update: "+author3);
        //delete
        session.delete(author1);

        session.getTransaction().commit();
    }
}
