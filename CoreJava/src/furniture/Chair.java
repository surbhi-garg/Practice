package furniture;
public class Chair extends Furniture {
    boolean isReclinable;
    boolean isFoldable;


    public Chair(String color, float price, furniture.Material material,boolean isReclinable,boolean isFoldable) {
        super(color, price, material);
        this.isReclinable=isReclinable;
        this.isFoldable=isFoldable;
    }

    @Override
    public void fireTest() {
        System.out.println("Material of chair is:"+this.getMaterial().getMaterialName()+"Under fire it behaves like"+this.getMaterial().getBehaviorFire());
    }

    @Override
    public void stressTest() {
        System.out.println("Material of chair is: "+this.getMaterial().getMaterialName()+"Under stress it behaves like"+this.getMaterial().getBehaviorStress());

    }
}
