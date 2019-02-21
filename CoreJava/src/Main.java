public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("My Exception");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
