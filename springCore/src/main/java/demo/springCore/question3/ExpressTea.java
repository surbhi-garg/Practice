package demo.springCore.question3;

public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing express tea");
    }
}
