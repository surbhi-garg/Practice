import java.util.ArrayList;
import java.util.Scanner;

/*Question--5*/
public class Intersect {
    static  void readArray(int[]arr,int arraySize)
    {
        Scanner in=new Scanner(System.in);
        for(int index=0;index<arraySize;index++)
        {
            System.out.println(index+"th element:");
            arr[index]=in.nextInt();
        }
    }
    static void findCommonElements(int[]firstArray, int[]secondArray, ArrayList<Integer>intersectingElements)
    {
        int count=0;
       for(int curFirst:firstArray)
       {
           for(int curSecond:secondArray)
           {
               if(curFirst==curSecond)
                   intersectingElements.add(curFirst);
           }
       }
    }
    //This can be optimized using merge sort logic, provided the arrays are sorted
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number of elements of first array:");
        int firstArraySize=in.nextInt();

        System.out.println("Enter the number of elements of second array:");
        int secondArraySize=in.nextInt();

        int[]firstArray=new int[firstArraySize];
        int[]secondArray=new int[secondArraySize];

        System.out.println("Enter the elements of first array");
        readArray(firstArray,firstArraySize);

        System.out.println("Enter the elements of second array");
        readArray(secondArray,secondArraySize);

        ArrayList<Integer>intersectingElements=new ArrayList<Integer>();
        findCommonElements(firstArray,secondArray,intersectingElements);

        System.out.println("Common elements between entered arrays are:");
        for(int ele:intersectingElements)
        {
            System.out.println(ele);
        }


    }
}
