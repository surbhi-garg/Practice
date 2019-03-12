package demo;

public class GreeterService {
   public void greet()
    {
        System.out.println("Good Morning");
    }
  public   void greet(String name)
    {
        System.out.println("Good Morning"+name);
    }
   public void greet(String name,String message)
    {
        System.out.println(name+" "+message);
    }
}
