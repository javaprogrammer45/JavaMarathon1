package day9.Task2;

import java.util.Objects;

public abstract class Figure {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();


}
