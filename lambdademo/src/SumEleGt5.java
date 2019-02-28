import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumEleGt5 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(integerList
        .stream().filter(e->e>5).collect(Collectors.summingInt(e->e)));
    }
}
