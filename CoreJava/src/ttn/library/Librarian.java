package ttn.library;

import java.util.List;

public class Librarian {
    String name;
    public boolean checkCardValidity(Member member)
    {
        System.out.println("Calls member.isCardValid");
        return false;
    }
    public int issueBooks(List<Book>bookList)
    {
        System.out.println("1.Check if it's a member or non member, and limit on how many books can client issue");
        System.out.println("In case of member,checks for card vailidity using checkCardValidity,in case of non-membber generates temporary card");
        System.out.println("check availability of book");
        System.out.println("creates an object of BookIssueAccordingly");
        System.out.println("Issued books are saved in system with client");
        System.out.println("Returns valid issueId in case of success");
        return 0;
    }
    public void takeBookReturns(BookIssue bookIssue)
    {
        System.out.println("Check for history..if exceeds due date calculate fine,else take return");
    }
    public float calculateFine(BookIssue issue)
    {
        System.out.println("calculates fine based on number of books and due date");
        return 1.0f;
    }
    public int issueTemporaryCard(NonMember nonMember)
    {
        System.out.println("return temporary card id for a non-member valid for fix time");
        return 1;
    }
    public boolean checkAvailabilityOfBook(String title){
        System.out.println("Checks for availability of book by title of book and returns status");
        return false;
    }
    public int findBook(String title)
    {
        System.out.println("Gets the rack number of a book where it is placed, using title");
        return 0;
    }
}
