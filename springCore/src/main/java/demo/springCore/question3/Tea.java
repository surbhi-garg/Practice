package demo.springCore.question3;

public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing tea");
    }
}
