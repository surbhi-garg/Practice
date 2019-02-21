import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatch {
    static int divide(int numerator,int denominator)
    {
        return numerator/denominator;
    }

    static File openFile(final String path)
    {
        return new File(path);
    }

    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(System.in);

            System.out.println("Enter numerator");
            int numerator=in.nextInt();

            System.out.println("Enter denominator");
            int denominator=in.nextInt();

            in.nextLine();
            System.out.println("Enter file path");
            String path=in.nextLine();

            System.out.println(divide(numerator,denominator));

            File result=openFile(path);
            FileReader reader=new FileReader(result);
        }
        catch (ArithmeticException arithmeticException)
        {
            arithmeticException.printStackTrace();
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("Exception"+fileNotFoundException.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally");
        }
    }
}
