import java.util.Arrays;
import java.util.List;

public class DoubleAndAverage {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(integerList.stream().mapToInt(e->e*2).average());
    }

}
