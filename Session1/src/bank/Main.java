package bank;

public class Main {
    public static void main(String[] args) {
        Boi boi=new Boi(10f,1000,50);
        Icic icici=new Icic(15f,1500,60);
        Sbi sbi=new Sbi(16f,1600,70);

        boi.getDetails();
        icici.getDetails();
        sbi.getDetails();

    }
}
