import java.util.Scanner;
//Question-6
public class FindNonRepeating {
    //Find the first occurrence of an element in array.
    static int findFirst(int[]inputArr,int searchKey)
    {
        for(int i=0;i<inputArr.length;i++)
        {
            if(inputArr[i]==searchKey)
                return i;
        }
        return -1;
    }
    //Find last occurrence of an element in array.
    static int findLast(int[]inputArr,int searchKey)
    {
        int first=findFirst(inputArr,searchKey);

        if(first==-1)
            return -1;

        if(first==inputArr.length-1)
            return inputArr.length-1;

        for(int i=first+1;i<inputArr.length;i++)
        {
            if(inputArr[i]==searchKey)
                return i;
        }

        return first;
    }
    static int findNonRepeatingElement(int[]inputArray)
    {
        for(int index=0;index<inputArray.length;index++)
        {
            int firstIndex=findFirst(inputArray,inputArray[index]);
            int lastIndex=findLast(inputArray,inputArray[index]);

            /**If there are chances that element will not be found in array, we can code it here,
             * however,it will not be a case here.
             */

            if(firstIndex==-1)
                continue;

            /*If element occurs only once, it will have same first and last index*/
            if(lastIndex-firstIndex==0) {
                return index;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int foundNonRepeating=0;
        int[]inputArray;
        int eleCount;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number of elements of array");
        eleCount=in.nextInt();

        inputArray=new int[eleCount];
        System.out.println("Enter elements of array:");

        for(int i=0;i<eleCount;i++)
        {
            System.out.println(i+1 +"th element:");
            inputArray[i]=in.nextInt();
        }

        foundNonRepeating=findNonRepeatingElement(inputArray);

        if(foundNonRepeating==-1)
        {
            System.out.println("There is no distinct element present in array.");
        }
        else
        {
            System.out.println("Non-Repeating element is "+inputArray[foundNonRepeating]);
        }

    }
}
