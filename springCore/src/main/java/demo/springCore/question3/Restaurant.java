package demo.springCore.question3;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
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
