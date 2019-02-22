import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CountryWiseDateFormatter {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale localeItalian = new Locale("it","ch");
        Locale localeCanada=new Locale(Locale.CANADA_FRENCH.getLanguage(),Locale.CANADA.getCountry());
        DateFormat dateFormat = DateFormat.getDateInstance (DateFormat.FULL, localeItalian);
        System.out.println("today is in Italian Language  in Switzerland Format : "+ dateFormat.format(d1));

        DateFormat dateFormat2 = DateFormat.getDateInstance (DateFormat.FULL, localeCanada);
        System.out.println("today is in French Language  in Canada Format : "+ dateFormat2.format(d1));
    }
}
