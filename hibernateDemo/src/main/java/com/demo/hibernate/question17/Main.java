package com.demo.hibernate.question17;
import com.demo.hibernate.Address;
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
        author1.setSubjectList(Arrays.asList("Science","Java","Maths"));



        Book book1=new Book();
        book1.setBookName("Introduction to C++");
        book1.getAuthorSet().addAll(Arrays.asList(author,author1));


        Book book2=new Book();
        book2.setBookName("Introdunction to java");
        book2.getAuthorSet().addAll(Arrays.asList(author,author1));

        author.getBookSet().addAll(Arrays.asList(book1,book2));

        author1.getBookSet().addAll(Arrays.asList(book1,book2));


        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.persist(author);
        session.persist(author1);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}



