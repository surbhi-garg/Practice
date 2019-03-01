package com.design.bridge;

//implementor
interface Color {
    public String fillColor();
}

//Concrete implementor
class RedColor implements Color {
    @Override
    public String fillColor() {
        return "Filling red color in object";
    }
}

class BlueColor implements Color {
    @Override
    public String fillColor() {
        return "Filling blue color in object";
    }
}

class PinkColor implements Color {
    @Override
    public String fillColor() {
        return "Filling pink color in object";
    }
}

//Abstraction
abstract class Shape {
    private static int numberOfDimensions;
    private Color color;

    public Shape(int numberOfDimensions, Color color) {
        this.numberOfDimensions = numberOfDimensions;
        this.color = color;
    }

    public int getNumberOfDimensions() {
        return numberOfDimensions;
    }

    public void setNumberOfDimensions(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}

//Refined Abstraction
class Square extends Shape {
    private int side;

    public Square(Color color, int side) {
        super(1, color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "color=" + getColor().fillColor() +
                '}';
    }
}

class Triangle extends Shape {
    private int base, height;

    public Triangle(Color color, int base, int height) {
        super(2, color);
        this.base = base;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "color=" + getColor().fillColor() +
                '}';
    }
}

public class BridgePatternDemo {
    public static void main(String[] args) {
        Square blueSquare = new Square(new BlueColor(), 4);
        System.out.println(blueSquare);
        Square redSquare = new Square(new RedColor(), 5);
        System.out.println(redSquare);

        Triangle pinkTriangle = new Triangle(new PinkColor(), 4, 2);
        System.out.println(pinkTriangle);


    }
}
