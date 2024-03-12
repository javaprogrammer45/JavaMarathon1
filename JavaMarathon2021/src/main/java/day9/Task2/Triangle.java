package day9.Task2;

public class Triangle extends Figure {
    private double lengthSide1;
    private double lengthSide2;
    private double lengthSide3;


    Triangle(double lengthSide1, double lengthSide2, double lengthSide3, String color) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    public double area() {
        double a = (lengthSide1 + lengthSide2 + lengthSide3) / 2.0;  // полупериметр
        double areaTriangle = Math.sqrt(a * (a - lengthSide1) * (a - lengthSide2) * (a - lengthSide3));
        return areaTriangle;
    }

    public double perimeter() {
        double perimeterTriangle = lengthSide1 + lengthSide2 + lengthSide3;
        return perimeterTriangle;
    }

}
