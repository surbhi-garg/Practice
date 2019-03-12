package demo.springCore.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex=applicationContext.getBean("complexBean",Complex.class);
        System.out.println("list: "+complex.getList());
        System.out.println("set: "+complex.getSet());
        System.out.println("map: "+complex.getMap());
    }
}
