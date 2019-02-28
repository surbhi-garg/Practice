public class DefaultOverrideDemo implements Greeter {

    public void display()
    {
        System.out.println("Overridden original display method");
    }

    public static void main(String[] args) {
        new DefaultOverrideDemo().display();
    }
}
