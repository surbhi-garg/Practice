package ttn.library;

public class NonMember extends Client {
    @Override
    public void requestForBooksIssue() {
        System.out.println("Requests for books");
        System.out.println("Librarian issues a temporary cardId valid only for 15 days");
        System.out.println("Books are issued");
    }
}
