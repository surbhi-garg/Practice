public class BiFunctionDriver {
    int add(int a,int b)
    {
        return a+b;
    }
    int subtract(int a,int b)
    {
        return a-b;
    }
    static int multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        BiFunction  adder=new BiFunctionDriver()::add;
        BiFunction findDifference=new BiFunctionDriver()::subtract;
        BiFunction multiply=BiFunctionDriver::multiply;

        System.out.println(adder.perform(4,5));
        System.out.println(findDifference.perform(5,4));
        System.out.println(multiply.perform(4,5));

    }
}
