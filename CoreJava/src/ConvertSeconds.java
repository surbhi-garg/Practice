import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter seconds;");
        int numberOfSeconds=in.nextInt();

        int numberOfDays=numberOfSeconds/(24*3600); //1hour-->60mins-->60seconds--->3600seconds
        int numberOfHours=((numberOfSeconds%(24*3600))/3600);
        int numberofMinutes=(((numberOfSeconds%(24*3600))%3600)/60);
        int numberOfSecond=(((numberOfSeconds%(24*3600))%3600)%60);

        System.out.println(numberOfSeconds+" is equivalent to:- ");
        System.out.println("Days: "+numberOfDays);

        System.out.println("Hours: "+numberOfHours);

        System.out.println("Minutes: "+numberofMinutes);

        System.out.println("Seconds: "+numberOfSecond);
    }
}
