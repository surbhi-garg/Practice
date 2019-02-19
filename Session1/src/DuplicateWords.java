import java.util.*;

/*Question--2*/
public class DuplicateWords {
    static HashMap<String,Integer> findDuplicateOccurrences(String inputString)
    {
        HashMap<String,Integer>wordOccurrenceMap=new HashMap<String, Integer>();
        //converting a string to a single case so that occurrence of a single word can be counted correctly, irrespective of case
        StringTokenizer wordsinString=new StringTokenizer(inputString.toLowerCase());
        while(wordsinString.hasMoreTokens())
        {
            String currentWord=wordsinString.nextToken();
            if(!wordOccurrenceMap.containsKey(currentWord))
            {
                wordOccurrenceMap.put(currentWord,1);
            }
            else
            {
                wordOccurrenceMap.put(currentWord,wordOccurrenceMap.get(currentWord)+1);
            }
        }
        return wordOccurrenceMap;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String inputString=in.nextLine();

        HashMap<String,Integer>wordOccurrenceMap=findDuplicateOccurrences(inputString);

        System.out.println("word-----------------occurrence");
        for(Map.Entry<String,Integer>curPair:wordOccurrenceMap.entrySet())
        {
            System.out.println(curPair.getKey()+"------"+curPair.getValue());
        }

    }

}
