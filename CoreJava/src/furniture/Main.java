package furniture;

public class Main {
    public static void main(String[] args) {
        Chair woodenChair=new Chair("brown",1000f,new Material("wooden","catches fire easily","can handle more load"),false,false);
        Chair metalChair=new Chair("blue",1500,new Material("metal","doesn't catch fire that easily","can handles less load"),true,true);

        Table woodenTable=new Table("black",2000,new Material("wooden","catches fire easily","can handle more load"),4,false);
        Table metalTable=new Table("brown",2500,new Material("metal","doesn't catch fire that easily","can handles less load"),3,false);

        woodenChair.fireTest();
        metalChair.fireTest();

        woodenChair.stressTest();
        metalChair.stressTest();

        woodenTable.fireTest();
        metalTable.fireTest();

        woodenTable.stressTest();
        metalTable.stressTest();
    }
}
