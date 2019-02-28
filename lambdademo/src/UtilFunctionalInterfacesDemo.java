import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UtilFunctionalInterfacesDemo {
    public static void main(String[] args) {
        //1Consumer
        Consumer<List<Integer>> consumer= e->e.forEach(System.out::println);
        consumer.accept(Arrays.asList(3,4,5,6));

        //2.Supplier
        Supplier<Integer>supplier=()->5;
        System.out.println(supplier.get());

        //3.Predicate
        Predicate<String>testString=e->e.length()>5;
        System.out.println("Result of length>5 "+testString.test("Surbhi Garg"));

        //4.Function
        Function<Integer,Integer>square=e->e*e;
        System.out.println("Square of number "+square.apply(5));



    }
}
