import java.util.Scanner;

/*Question-1*/
public class ReplaceSubstring {
    //will replace all occurrences of toBeReplaced
    static String replaceSubstringWithString(String originalString,String toBeReplaced,String newString)
    {
          return originalString.replace(toBeReplaced,newString);
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String originalString=in.next();

        System.out.println("Enter substring to be replaced");
        String tobeReplaced=in.next();

        System.out.println("Enter new substring");
        String newString=in.next();

        System.out.println(replaceSubstringWithString(originalString,tobeReplaced,newString));


    }
}
