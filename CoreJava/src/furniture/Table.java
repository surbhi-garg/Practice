package furniture;

public class Table extends Furniture {
    int numberOfLegs;
    boolean hasWheels;

    public Table(String color, float price, Material material, int numberOfLegs, boolean hasWheels) {
        super(color, price, material);
        this.numberOfLegs = numberOfLegs;
        this.hasWheels = hasWheels;
    }

    @Override
    public void fireTest() {
        System.out.println("Material of table is:"+this.getMaterial().getMaterialName()+"Under fire it behaves like"+this.getMaterial().getBehaviorFire());
    }

    @Override
    public void stressTest() {
        System.out.println("Material of table is: "+this.getMaterial().getMaterialName()+"Under stress it behaves like"+this.getMaterial().getBehaviorStress());

    }
}
