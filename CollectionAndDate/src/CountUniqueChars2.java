import java.util.*;

public class CountUniqueChars2 {
    public static int countUniqueChars(String inputString) {
        List<Character> uniqueCharList = new LinkedList<Character>();
        inputString=inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char currrentChar = Character.toLowerCase(inputString.charAt(i));
            int fistIndex=inputString.indexOf(currrentChar);
            int lastIndex=inputString.lastIndexOf(currrentChar);
            if(lastIndex-fistIndex==0)
                uniqueCharList.add(currrentChar);

        }
        return uniqueCharList.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String inputString = in.nextLine();

        int countUniqueCharacters = countUniqueChars(inputString);
        System.out.println("Number of unique characters in " + inputString + " are " + countUniqueCharacters);


    }
}
