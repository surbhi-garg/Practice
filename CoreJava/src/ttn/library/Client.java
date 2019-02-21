package ttn.library;

import java.util.List;

public abstract class Client {
   private String name;

    //Constructor and getter setter here
    public abstract void requestForBooksIssue();
    public void returnBooks(List<Book>bookList){
        System.out.println("execute the return flow");
    }

}
