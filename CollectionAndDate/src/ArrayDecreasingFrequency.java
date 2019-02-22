import java.util.*;
class MyComparator implements Comparator<Map.Entry<Integer,Integer>>
{
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if(o1.getValue()==o2.getValue())
        {
            //o1 must have come in list before,therefore,o2 must come in list after o1 when there frequencies are same
            //compareTo positive value-->second is greater than first.
            return 1;
        }
        return o2.getValue()-o1.getValue();
    }
}
public class ArrayDecreasingFrequency {
    static Scanner in;
    public static void main(String[] args) {
        in=new Scanner(System.in);

        System.out.println("Enter number of elements of array");
        int eleCount=in.nextInt();
        int[] inputArray=new int[eleCount];

        readArray(inputArray,eleCount);

        LinkedHashMap<Integer,Integer>elementOccurrenceMap=countOccurrenceOfEachElement(inputArray);
        System.out.println("Occurrence of each element in array is as follows:");
        System.out.println("format (element=occurrence)");
        System.out.println(elementOccurrenceMap);

        List<Map.Entry<Integer,Integer>> elementOcurrenceList=new ArrayList(elementOccurrenceMap.entrySet());

        Collections.sort(elementOcurrenceList,new MyComparator());
        System.out.println("Elements sorted in descending order of frequency...and in case frequency is same,sorted in insertion order");
        System.out.println("format (element=occurrence)");
        System.out.println(elementOcurrenceList);

        System.out.println("Printing array elements according to given scenario:");
        for(Map.Entry<Integer,Integer>curEntry:elementOcurrenceList)
        {
            for(int i=0;i<curEntry.getValue();i++)
            {
                System.out.println(curEntry.getKey());
            }
        }


    }


    private static LinkedHashMap<Integer, Integer> countOccurrenceOfEachElement(int[] inputArray) {
        LinkedHashMap<Integer,Integer>elementOccurrenceMap=new LinkedHashMap<Integer, Integer>();
        for(int i=0;i<inputArray.length;i++)
        {
            int curArrayElement=inputArray[i];
            int valuePresentInMap=elementOccurrenceMap.getOrDefault(curArrayElement,0);

            elementOccurrenceMap.put(curArrayElement,valuePresentInMap+1);

        }
        return elementOccurrenceMap;
    }

    private static void readArray(int[] inputArray, int eleCount) {
        for(int i=0;i<eleCount;i++)
        {
            System.out.println("Enter "+(i+1)+" element");
            inputArray[i]=in.nextInt();
        }
    }
}
