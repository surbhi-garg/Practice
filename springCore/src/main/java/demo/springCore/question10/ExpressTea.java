package demo.springCore.question10;

import org.springframework.stereotype.Controller;

@Controller("expressTeaDrink")
public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing express tea");
    }
}
