interface StrengthTester
{
    default void test()
    {
        System.out.println("Testing strength");
    }
}
interface QualityTester
{
    default void test()
    {
        System.out.println("Testing quality");
    }
}
public class MultipleInheritanceDemo implements StrengthTester,QualityTester{
    public void test()
    {
        StrengthTester.super.test();
        QualityTester.super.test();
        System.out.println("Overall test method");
    }

    public static void main(String[] args) {
        new MultipleInheritanceDemo().test();
    }
}
