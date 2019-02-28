@FunctionalInterface
interface FindGreater
{
    boolean checkFirstIsGreater(int a, int b);
}

@FunctionalInterface
interface AddOne
{
    int incrementByOne(int a);
}
@FunctionalInterface
interface Concat
{
    String concat(String str1, String str2);
}
@FunctionalInterface
interface ConvertCase
{
    String topUpper(String str1);
}
public class LambdaDemo {
    public static void main(String[] args)
    {
        FindGreater findGreater=(a,b)->a>b;
        System.out.println(findGreater.checkFirstIsGreater(1,2));

        AddOne addOne=a->a+1;
        System.out.println(addOne.incrementByOne(5));

        Concat concat=(str1,str2)->str1+str2;
        System.out.println(concat.concat("Surbhi","Garg"));

        ConvertCase convertCase=str1->str1.toUpperCase();
        System.out.println(convertCase.topUpper("surbhi"));

    }
}
