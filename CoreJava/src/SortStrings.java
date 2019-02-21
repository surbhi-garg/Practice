import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
    static Scanner in;

    //utility function to read an array
    static void readArray(String[]inputArray,int eleCount)
    {
        in=new Scanner(System.in);
        for(int i=0;i<eleCount;i++)
        {
            System.out.println("Enter"+(i+1)+" th string");
            inputArray[i]=in.next();
        }
    }
    static int compareStrings(String first,String second)
    {
        int firstLength = first.length();
        int secondLength = second.length();
        int min = firstLength<secondLength?firstLength:secondLength;
        for (int i = 0; i < min; i++) {
            char c1 = first.charAt(i);
            char c2 = second.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return firstLength-secondLength;

    }
    static void sortStringArray(String[]inputArray)
    {
        for(int i=0;i<inputArray.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<inputArray.length;j++)
            {
                int res=compareStrings(inputArray[j],inputArray[minIndex]);
                if(res<0)
                    minIndex=j;
            }

            String temp=inputArray[minIndex];
            inputArray[minIndex]=inputArray[i];
            inputArray[i]=temp;
        }
    }

    public static void main(String[] args) {
        in=new Scanner(System.in);

        System.out.println("Enter number of elements in array");
        int eleCount=in.nextInt();

        String[] inputArray=new String[eleCount];
        readArray(inputArray,eleCount);

        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(inputArray));

        sortStringArray(inputArray);

        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(inputArray));


    }
}
