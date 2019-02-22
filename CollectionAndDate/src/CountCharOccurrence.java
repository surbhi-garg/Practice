import java.util.HashMap;
import java.util.Scanner;

public class CountCharOccurrence {
    public static HashMap<Character, Integer> countCharacterOccurrenceInString(String inputString) {
        HashMap<Character, Integer> characterOccurrenceMap = new HashMap<Character, Integer>();
        for (int i = 0;i < inputString.length(); i++) {
            char currentChar = Character.toLowerCase(inputString.charAt(i));
                int currentValuePresentInMap = characterOccurrenceMap.getOrDefault(currentChar, 0);
                characterOccurrenceMap.put(currentChar, currentValuePresentInMap + 1);
        }
        return characterOccurrenceMap;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String inputString=in.nextLine();

        HashMap<Character,Integer>characterIntegerHashMap=countCharacterOccurrenceInString(inputString);

        System.out.println(characterIntegerHashMap);

    }
}
