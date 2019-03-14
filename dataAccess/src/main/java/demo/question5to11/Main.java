package demo.question5to11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);

        //Question5
         System.out.println("Number of users in table is: " + userDao.countAllUsers());

        //Question6
        System.out.println("Name of user with username surbhi is: " + userDao.findNameByUserName("surbhi"));

        //Question7
        Users user=new Users();
        user.setName("yukti");
        user.setUserName("yukti123");
        user.setAge(22);
        user.setPassword("yukti@123");
        user.setDob(LocalDate.parse("1996-05-01"));

        if(userDao.addUser(user)>0)
        System.out.println("Added successfully");
        else
        System.out.println("Some error occurred");

        //Question8
          userDao.findUserByUserName("yukti123");

        //Question9
         userDao.printAllUsers();

        //Question10
        Users user1=userDao.getUser("surbhi");
        System.out.println(user1);
//        Question11
        userDao.countUsersUsingHql();
    }
}
