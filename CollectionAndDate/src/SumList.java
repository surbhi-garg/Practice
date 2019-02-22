import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*Question 1*/
public class SumList {
    public static void main(String[] args) {
        LinkedList<Float> floatList=new LinkedList<>();
        floatList.add(2.5f);
        floatList.add(3.7f);
        floatList.add(4.5f);
        floatList.add(3.2f);
        floatList.add(2.1f);

        float sum=calculateSum(floatList);
        System.out.println("Sum of numbers in list is:---->"+sum);


    }

    private static float calculateSum(LinkedList<Float> floatList) {
        float sum=0f;
        Iterator<Float>iterator=floatList.iterator();
        while(iterator.hasNext())
        {
            sum+=iterator.next();
        }
        return sum;
    }
}
