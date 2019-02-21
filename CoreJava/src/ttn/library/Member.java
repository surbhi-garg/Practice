package ttn.library;

import java.util.Date;

public class Member extends Client {
    long phoneNumber;
    String address;
    Date cardIssueDate;
    Date cardExpiryDate;

    @Override
    public void requestForBooksIssue() {
        System.out.println("Show card to librarian");
        System.out.println("librarian checks for validity of card in issueBooks()");
        System.out.println("If valid provide names of books");
    }
    public boolean isCardValid()
    {
        System.out.println("Check if expiry date < current date return true/false");
        return false;
    }
}
