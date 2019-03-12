package demo.springCore.question6;

import demo.springCore.question3.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.getBean("restaurantAutowireByName", Restaurant.class).getHotDrink().prepareHotDrink();
        applicationContext.getBean("restaurantAutowireByType", Restaurant.class).getHotDrink().prepareHotDrink();
        applicationContext.getBean("restaurantAutowireByConstructor",Restaurant.class).getHotDrink().prepareHotDrink();
    }
}
