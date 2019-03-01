enum CarType {
    MINI, MACRO, LUXURY
}

enum Location {
    INDIA, CANADA, USA
}

abstract class Car {
    private CarType carType;
    private Location location;
    private String color;

    public Car(CarType carType, Location location, String color) {
        this.carType = carType;
        this.location = location;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                ", color='" + color + '\'' +
                '}';
    }

    abstract void manufactureCar();
}

class MiniCar extends Car {

    public MiniCar(Location location, String color) {
        super(CarType.MINI, location, color);
    }

    @Override
    void manufactureCar() {
        System.out.println("Creating Mini car with color" + getColor());

    }

}

class MacroCar extends Car {
    public MacroCar(Location location, String color) {
        super(CarType.MACRO, location, color);
    }

    @Override
    void manufactureCar() {
        System.out.println("Creatng Macro car with color " + getColor());
    }
}

class LuxuryCar extends Car {
    public LuxuryCar(Location location, String color) {
        super(CarType.LUXURY, location, color);
    }

    @Override
    void manufactureCar() {
        System.out.println("Creating luxury car with color: " + getColor());
    }
}

class IndianCarFactory {
    static Car buildCar(CarType carType, String color) {
        Car car = null;
        switch (carType) {
            case MINI:
                car = new MiniCar(Location.INDIA, color);
                break;
            case MACRO:
                car = new MacroCar(Location.INDIA, color);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA, color);
                break;
        }
        return car;
    }
}

class CanadaCarFactory {
    static Car buildCar(CarType carType, String color) {
        Car car = null;
        switch (carType) {
            case MINI:
                car = new MiniCar(Location.CANADA, color);
                break;
            case MACRO:
                car = new MacroCar(Location.CANADA, color);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.CANADA, color);
                break;
        }
        return car;
    }
}

class USACarFactory {
    static Car buildCar(CarType carType, String color) {
        Car car = null;
        switch (carType) {
            case MINI:
                car = new MiniCar(Location.USA, color);
                break;
            case MACRO:
                car = new MacroCar(Location.USA, color);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA, color);
                break;
        }
        return car;
    }
}

class CarFactory {
    static Car buildCar(CarType carType, Location location, String color) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType, color);
                break;
            case USA:
                car = USACarFactory.buildCar(carType, color);
                break;
            case CANADA:
                car=CanadaCarFactory.buildCar(carType, color);
                break;
        }
        return car;
    }
}

public class AbstractCarFactoryDemo {
    public static void main(String[] args) {
        Car miniIndianCar=CarFactory.buildCar(CarType.MINI,Location.INDIA,"red");
        Car macroIndianCar=CarFactory.buildCar(CarType.MACRO,Location.INDIA,"blue");
        Car luxuryIndanCar=CarFactory.buildCar(CarType.LUXURY,Location.INDIA,"black");

        System.out.println("Indian cars");
        System.out.println(miniIndianCar);
        System.out.println(macroIndianCar);
        System.out.println(luxuryIndanCar);

        Car miniCanadianCar=CarFactory.buildCar(CarType.MINI,Location.CANADA,"red");
        Car macroCanadianCar=CarFactory.buildCar(CarType.MACRO,Location.CANADA,"blue");
        Car luxuryCanadianCar=CarFactory.buildCar(CarType.LUXURY,Location.CANADA,"black");

        System.out.println("Canada Cars");
        System.out.println(miniCanadianCar);
        System.out.println(macroCanadianCar);
        System.out.println(luxuryCanadianCar);

        Car miniUSACar=CarFactory.buildCar(CarType.MINI,Location.USA,"red");
        Car macroUSACar=CarFactory.buildCar(CarType.MACRO,Location.USA,"blue");
        Car luxuryUSACar=CarFactory.buildCar(CarType.LUXURY,Location.USA,"black");

        System.out.println("USA Cars");
        System.out.println(miniUSACar);
        System.out.println(macroUSACar);
        System.out.println(luxuryUSACar);
    }

}
