class Greeter
{
    void greet(User user)
    {
        System.out.println("Hello "+user.getName());
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Greeter greeter=new Greeter();
        greeter.greet(new User("Surbhi"));


    }
}