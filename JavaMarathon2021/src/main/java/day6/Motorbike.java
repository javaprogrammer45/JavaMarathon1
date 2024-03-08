package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfManufacture;

    public Motorbike(String model, String color, int yearOfManufacture) {
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        info();
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

    public void info() {
        System.out.println("Это мотоцикл!!!");
    }

    public int yearDifference(int inputYear) {
        int result = 0;
        if (inputYear > yearOfManufacture) {
            result = (yearOfManufacture - inputYear) * (-1);
        } else {
            result = yearOfManufacture - inputYear;
        }
        return result;
    }
}
