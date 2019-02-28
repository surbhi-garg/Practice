import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FistEvenGt3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> result=integerList.stream().filter(e->e>3).filter(e->e%2==0).findFirst();
        if(result.isPresent())
        {
            System.out.println("First number greater than 3 and even in the list is:"+result.get());
        }
        else
        {
            System.out.println("No such value");
        }

        //using logical operator within single filter
        System.out.println(integerList.stream().filter(e->e>3&&e%2==0).findFirst());
    }
}
