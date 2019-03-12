package demo.springCore.question8Andquestion9;

import demo.springCore.question3.HotDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
    //autowiring using field--uncomment to see effect
//    @Autowired
//            @Qualifier("tea")
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    //question-8 --added @Required--uncomment to see effect
   // @Required
    //autowiring using setter--uncomment these two lines to run this
//    @Autowired
//    @Qualifier("tea")
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
    public Restaurant(){}

    //using contructor
    @Autowired
    public Restaurant(@Qualifier("tea") HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
