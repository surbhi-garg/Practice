package ttn.library;

public class Book {
    int id;
    String title;
    String authorName;
    int countAvailable;
    int rackNumber;

    public Book(int id, String title, String authorName, int countAvailable, int rackNumber) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.countAvailable = countAvailable;
        this.rackNumber = rackNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCountAvailable() {
        return countAvailable;
    }

    public void setCountAvailable(int countAvailable) {
        this.countAvailable = countAvailable;
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(int rackNumber) {
        this.rackNumber = rackNumber;
    }
}
