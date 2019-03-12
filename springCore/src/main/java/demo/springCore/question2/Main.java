package demo.springCore.question2;

import demo.springCore.question1.Database;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Database database=applicationContext.getBean("database",Database.class);
        System.out.println("Got database object with following properties: ");
        System.out.println("port: "+database.getPort());
        System.out.println("name: "+database.getName());
    }
}
