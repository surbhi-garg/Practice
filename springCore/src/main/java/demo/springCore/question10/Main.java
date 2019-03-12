package demo.springCore.question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Tea teaDrink=applicationContext.getBean("teaDrink",Tea.class);
        ExpressTea expressTea=applicationContext.getBean("expressTeaDrink",ExpressTea.class);
        Restaurant restaurant=applicationContext.getBean("restaurant2",Restaurant.class);
        teaDrink.prepareHotDrink();
        expressTea.prepareHotDrink();
        restaurant.getHotDrink().prepareHotDrink();
    }
}
