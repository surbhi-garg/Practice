package demo.springCore.question10;

import org.springframework.stereotype.Component;

@Component("teaDrink")
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing tea");
    }
}
