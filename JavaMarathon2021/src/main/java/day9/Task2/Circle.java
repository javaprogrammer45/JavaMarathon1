package day9.Task2;

import java.util.Objects;

public class Circle extends Figure {
    private double radiusCircle;

    Circle(double radiusCircle, String color) {
        super(color);
        this.radiusCircle = radiusCircle;

    }

    public double area() {
        double areaСircle = Math.PI * radiusCircle * radiusCircle;
        return areaСircle;
    }

    public double perimeter() {
        double perimeterCircle = 2 * Math.PI * radiusCircle;
        return perimeterCircle;
    }


}
