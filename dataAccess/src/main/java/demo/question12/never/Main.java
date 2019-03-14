package demo.question12.never;

import demo.question5to11.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
       UserDao userDao= applicationContext.getBean(UserDao.class);
        Users user=new Users();
        user.setUserName("shreya");
        user.setName("shreya");
        user.setPassword("shreya");
        user.setAge(22);
        user.setDob(LocalDate.parse("1996-05-01"));

        Users user2=new Users();
        user2.setUserName("shikha");
        user2.setName("shikha");
        user2.setPassword("shikha");
        user2.setAge(23);
        user2.setDob(LocalDate.parse("1995-05-01"));

        userDao.addTwoUsers(user,user2);
    }
}
