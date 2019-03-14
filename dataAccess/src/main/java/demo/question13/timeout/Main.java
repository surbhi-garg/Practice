package demo.question13.timeout;

import demo.question5to11.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao=applicationContext.getBean(UserDao.class);
        Users user=new Users();
        user.setName("xyz");
        user.setUserName("xyz");
        user.setPassword("xyz");
        user.setAge(25);
        user.setDob(LocalDate.parse("1993-07-08"));
        userDao.addUser(user);
    }
}
