import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*Question-3*/
public class FindFrequency {
    //way-1
    static int findFrequencyOfAChar(String inputString,char searchKey)
    {
        int length=inputString.length();
        inputString= inputString.toLowerCase();
        //total length-length of string without that character
       int charCount=length-inputString.replaceAll(Character.toString(Character.toLowerCase(searchKey)),"").length();
        return charCount;

    }

    //way-2
    static int findOccurrencyOfAChar2(String inputString,char searchKey)
    {
        //split will cause occurrence+1 splits.
       return inputString.toLowerCase().split(String.valueOf(Character.toLowerCase(searchKey)),-1).length-1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String inputString=in.next();

        System.out.println("Enter character to be searched");
        char searchKey=in.next().charAt(0);

        int charCount=findFrequencyOfAChar(inputString,searchKey);
        System.out.println("Result By way1");
        System.out.println(searchKey+" occurs "+charCount+" times");

        System.out.println("Result By way2");
        charCount=findOccurrencyOfAChar2(inputString,searchKey);
        System.out.println(searchKey+" occurs "+charCount+" times");
    }
}
