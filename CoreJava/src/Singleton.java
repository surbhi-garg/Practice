
public class Singleton {
    /*Three most common things to make class singleton*/
    //1private constructor so that it can't be instantiated outside
    private  Singleton()
    {

    }

    //2private static variable of same class--->only one object possible
    private  static Singleton singleton;

    //3public static method to get instance--global access point
    //double locking--to avoid extra overhead of synchronized method
    public static Singleton getInstance()
    {
        if(singleton==null)
        {
            synchronized (Singleton.class) {
                if(singleton==null)
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
