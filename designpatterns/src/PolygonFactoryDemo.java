interface Polygon
{
    public void paint();
}
class Square implements Polygon
{
    @Override
    public void paint() {
        System.out.println("Painting a square");

    }
}
class Rectangle implements Polygon
{
    @Override
    public void paint()
    {
        System.out.println("Painting a rectangle");
    }
}
class Pentagon implements Polygon
{
    @Override
    public void paint() {
        System.out.println("Painting a pentagon");
    }
}

class PolygonFactory
{
    static Polygon getPolygonInstance(int numberOfSides)
    {
        Polygon polygon=null;
        switch(numberOfSides)
        {
            case 1:polygon=new Square();
                break;
            case 2:polygon=new Rectangle();
                break;
            case 5:polygon=new Pentagon();
                break;

        }
        return polygon;

    }
}
public class PolygonFactoryDemo {
    public static void main(String[] args) {
        Polygon square=PolygonFactory.getPolygonInstance(1);
        square.paint();
        Polygon rectangle=PolygonFactory.getPolygonInstance(2);
        rectangle.paint();
        Polygon pentagon=PolygonFactory.getPolygonInstance(5);
        pentagon.paint();
    }
}
