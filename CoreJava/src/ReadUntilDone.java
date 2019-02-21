import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ReadUntilDone {
    static Scanner in;


    //part-a
    static HashMap<String,Boolean> readUntilDoneUsingWhile()
    {
        in=new Scanner(System.in);
        String inputString=null;
        HashMap<String,Boolean>inputsReceived=new HashMap<String, Boolean>();
        while(!(("done").equals(inputString)))
        {
            System.out.println("Enter a string");
            inputString=in.next();
            if(!inputString.equals("done"))
            inputsReceived.put(inputString,(inputString.charAt(0)==inputString.charAt(inputString.length()-1)));
        }
        return inputsReceived;
    }

    //part-b
    static HashMap<String,Boolean> readUntilDoneUsingDoWhile()
    {
        in=new Scanner(System.in);
        String inputString;
        HashMap<String,Boolean>inputsReceived=new HashMap<String, Boolean>();
        do
        {
            System.out.println("Enter a string");
            inputString=in.next();
            if(!inputString.equals("done"))
            inputsReceived.put(inputString,(inputString.charAt(0)==inputString.charAt(inputString.length()-1)));
        }while (!(inputString.equals("done")));
        return inputsReceived;
    }
    public static void main(String[] args) {
        HashMap<String,Boolean>inputCheckMap=readUntilDoneUsingWhile();
        System.out.println("Items read using while");
        System.out.println(inputCheckMap);

        inputCheckMap=readUntilDoneUsingDoWhile();
        System.out.println("Items read using while");
        System.out.println(inputCheckMap);
    }
}
