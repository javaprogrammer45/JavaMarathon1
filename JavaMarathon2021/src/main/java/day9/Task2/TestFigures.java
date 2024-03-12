package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10, 10, 10, "Red");
        Triangle triangle2 = new Triangle(10, 20, 30, "Green");
        Triangle triangle3 = new Triangle(10, 20, 15, "Red");

        Rectangle rectangle1 = new Rectangle(5, 10, "Red");
        Rectangle rectangle2 = new Rectangle(40, 15, "Orange");

        Circle circle1 = new Circle(4, "Red");
        Circle circle2 = new Circle(10, "Red");
        Circle circle3 = new Circle(5, "Blue");

        Figure[] figures = {triangle1, triangle2, triangle3, rectangle1, rectangle2, circle1, circle2, circle3};

        System.out.println("Сумма периметров красных фигур: " + TestFigures.calculateRedPerimeter(figures));
        System.out.println("Сумма площадей красных фигур: " + TestFigures.calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sum += figures[i].perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sum += figures[i].area();
            }
        }
        return sum;
    }
}
