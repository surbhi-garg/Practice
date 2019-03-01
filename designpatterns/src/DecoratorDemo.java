import java.util.Arrays;
import java.util.List;

/*Assuming the case of Domino's where there are some predefined
pizzas on which we can have some additional toppings and also considering
a customizable pizza which has no toppings
 */
interface Pizza {
    void makePizza();
}

class CustomizablePizza implements Pizza {
    @Override
    public void makePizza() {
        System.out.println("Making customizable pizza");
    }
}

class PeppyPaneerPizza implements Pizza {
    @Override
    public void makePizza() {
        System.out.println("Making peppy panner pizza");
    }
}

abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class ExtraCheeseDecorator extends PizzaDecorator {
    private String cheeseType;

    public ExtraCheeseDecorator(Pizza pizza, String cheeseType) {
        super(pizza);
        this.cheeseType = cheeseType;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println(" with extra cheese of type " + cheeseType);
    }
}

class VeggiesDecorator extends PizzaDecorator {
    List<String> vegetableList;

    public VeggiesDecorator(Pizza pizza, List<String> vegetableList) {
        super(pizza);
        this.vegetableList = vegetableList;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println(" with" + vegetableList);
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza capsicumAndCheesePizza = new VeggiesDecorator(
                new ExtraCheeseDecorator(new CustomizablePizza(), "margharita")
                , Arrays.asList("capsicum"));
         capsicumAndCheesePizza.makePizza();

        Pizza peppyPaneerWithExtraCheese = new ExtraCheeseDecorator(new PeppyPaneerPizza(), "pamesan");
        peppyPaneerWithExtraCheese.makePizza();
    }
}
