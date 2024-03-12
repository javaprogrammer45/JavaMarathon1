package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area() {
        double areaRectangle = (width * height);
        return areaRectangle;
    }



    public double perimeter() {
        double perimeterRectangle = (width + height) * 2;
        return perimeterRectangle ;
    }
}
