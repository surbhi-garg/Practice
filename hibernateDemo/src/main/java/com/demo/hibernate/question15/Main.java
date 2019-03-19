package com.demo.hibernate.question15;

import com.demo.hibernate.Address;
import com.demo.hibernate.Author;
import com.demo.hibernate.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.setBookName("Introduction to C++");

        Address address=new Address();
        address.setLocation("Vashisht Park");
        address.setState("Delhi");
        address.setStreetNumber(4);

        Author author=new Author(1,"Surbhi","Garg",23);
        author.setDob(new Date());
        author.setAddress(address);
        author.setSubjectList(Arrays.asList("Science","Java","Maths"));
        author.setBook(book);

        Author author1=new Author(2,"Kalpna","Sagar",35);
        author1.setDob(new Date());
        author1.setAddress(address);
        author1.setSubjectList(Arrays.asList("Hindi","C++","Spring"));
        author1.setBook(book);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(book);

        session.save(author);
        session.save(author1);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}


