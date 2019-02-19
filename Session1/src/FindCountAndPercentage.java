/* Question-4*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCountAndPercentage {
    static HashMap<String,Integer>countNumberOfOccurrencesBySymbolType(String input) {
        HashMap<String, Integer> typeCountmap = new HashMap<String, Integer>();
        String digit="digit";
        String lowercase="lowercase";
        String uppercase="uppercase";
        String specialchar="specialchar";

        for(int i=0;i<input.length();i++)
        {
            char curChar=input.charAt(i);
            if(Character.isLowerCase(curChar))
            {
                //if key lowercase is not found put 0, else increment by1
                typeCountmap.put(lowercase,typeCountmap.get(lowercase)==null?1:typeCountmap.get(lowercase)+1);
            }
            else if(Character.isUpperCase(curChar))
            {
                //if key uppercase is not found put 0, else increment by1
                typeCountmap.put(uppercase,typeCountmap.get(uppercase)==null?1:typeCountmap.get(uppercase)+1);
            }
            else if(Character.isDigit(curChar))
            {
                //if key digit is not found put 0, else increment by1
                typeCountmap.put(digit,typeCountmap.get(digit)==null?1:typeCountmap.get(digit)+1);
            }
            else
            {
                typeCountmap.put(specialchar,typeCountmap.get(specialchar)==null?1:typeCountmap.get(specialchar)+1);
            }
        }
        return typeCountmap;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String input=in.next();

        HashMap<String,Integer> typeCountMap=countNumberOfOccurrencesBySymbolType(input);

        System.out.println("Symbol type--------count------percentage");
        for(Map.Entry<String,Integer>curEntry:typeCountMap.entrySet())
        {
            System.out.println(curEntry.getKey()+"-----"+curEntry.getValue()+"-----"+((float)curEntry.getValue()*100)/input.length());
        }
    }
}
