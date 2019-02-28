interface Greeter
{
    default void display(){
        System.out.println("Hello World");
    }
    static void greet()
    {
        System.out.println("Good Morning");
    }

}
public class DefaultAndStaticMethodDemo implements Greeter {
    public static void main(String[] args) {
        new DefaultAndStaticMethodDemo().display();
        Greeter.greet();
    }
}
