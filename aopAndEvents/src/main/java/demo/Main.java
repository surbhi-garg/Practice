package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //Question1
        applicationContext.start();

        //Question3
        System.out.println("------------Question3----------------------");
        Database database=applicationContext.getBean("database",Database.class);
        System.out.println(database.getPort());
        System.out.println(database.getName());
        database.connect();


        //Question5 and Question7 andQuestion9
        System.out.println("------------Question5,7,9----------------------");
        GreeterService greeterService=applicationContext.getBean("service",GreeterService.class);
        greeterService.greet();
        greeterService.greet("Surbhi");
        greeterService.greet("Surbhi","GoodMorning");


        //Question6
        System.out.println("------------Question6----------------------");
        IoExceptionThrowers ioExceptionThrowers = applicationContext.getBean(IoExceptionThrowers.class);
        try {
            ioExceptionThrowers.info();
        } catch (IOException ioException) {
            System.out.println("Executing catch");
            System.out.println("caught "+ioException.getClass());
        }
        try {
            ioExceptionThrowers.display();
        } catch (IOException e) {
            System.out.println("Executing catch");
            System.out.println("caught "+e.getClass());
        }


//        Question1
        applicationContext.stop();
        applicationContext.close();
    }
}
