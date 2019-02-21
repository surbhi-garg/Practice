package furniture;

public abstract class Furniture {

    private String color;
    private float price;
    private furniture.Material material;


    public Furniture(String color, float price,furniture.Material material) {
        this.color = color;
        this.price = price;
        this.material=material;
    }
    public abstract void fireTest();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public furniture.Material getMaterial() {
        return material;
    }

    public void setMaterial(furniture.Material material) {
        this.material = material;
    }

    public abstract void stressTest();

}
