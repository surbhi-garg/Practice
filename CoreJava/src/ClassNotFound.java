public class ClassNotFound {
    public static void main(String[] args) {
        Greeter greeter=new Greeter();
        greeter.greet();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
