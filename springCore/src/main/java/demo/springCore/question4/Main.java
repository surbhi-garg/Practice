package demo.springCore.question4;

import demo.springCore.question3.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant teaRestaurant=context.getBean("teaRestaurant",Restaurant.class);
        teaRestaurant.getHotDrink().prepareHotDrink();
        Restaurant expressTeaRestaurant=context.getBean("expressTeaRestaurant",Restaurant.class);
        expressTeaRestaurant.getHotDrink().prepareHotDrink();

    }
}
