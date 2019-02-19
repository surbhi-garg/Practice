import java.util.Scanner;

public class ReverseAndRemove {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        StringBuffer input=new StringBuffer(in.next());

        int length=input.length();
        //using delete in this case won't throw an error, will simply remove characters found in given range
        if(length-1<9){
            System.out.println("Complete operation can't be performed");
        }
        else
        {
            //end is exclusive, that's why taken 10
            input.reverse().delete(4,10);
            System.out.println(input);
        }

    }
}
