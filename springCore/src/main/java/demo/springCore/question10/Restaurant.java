package demo.springCore.question10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("restaurant2")
public class Restaurant {
    @Autowired
            @Qualifier("teaDrink")
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
    public Restaurant(){}

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
