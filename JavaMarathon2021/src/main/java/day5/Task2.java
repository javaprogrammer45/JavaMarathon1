package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW", "Blue", 2024);
        System.out.print("Мотоцикл : ");
        System.out.print(motorbike.getModel() + "  ");
        System.out.print(motorbike.getColor() + "  ");
        System.out.print(motorbike.getYearOfManufacture());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int yearOfManufacture;

    public Motorbike(String model, String color, int yearOfManufacture) {
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}