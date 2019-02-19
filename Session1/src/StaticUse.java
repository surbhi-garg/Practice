public class StaticUse {
    static String firstName="Surbhi";
    static String lastName="Garg";
    static int age=23;
    static {
        System.out.println("Inside static");
        System.out.println("Surbhi Garg 23");
    }
    static void display()
    {
        System.out.println("In display");
        System.out.println("Surbhi Garg 23");
    }

    public static void main(String[] args) {
        display();
        System.out.println(firstName+" "+lastName+" "+age);
    }
}
