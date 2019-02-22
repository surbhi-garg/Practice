import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*Question-2*/
public class CountUniqueChars {
    public static int countUniqueChars(String inputString)
    {
        Set<Character>uniqueCharacters=new LinkedHashSet<Character>();
        for(int i=0;i<inputString.length();i++)
        {
            char currrentChar=Character.toLowerCase(inputString.charAt(i));
            uniqueCharacters.add(currrentChar);

        }
        return uniqueCharacters.size();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String inputString=in.nextLine();

        int countUniqueCharacters=countUniqueChars(inputString);
        System.out.println("Number of unique characters in "+inputString+" are "+countUniqueCharacters);


    }
}
