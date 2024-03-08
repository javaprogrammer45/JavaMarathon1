package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfManufacture;

    Car(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String carmodel) {
        carmodel = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String carcolor) {
        carcolor = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufactureCar) {
        yearOfManufactureCar = yearOfManufacture;
    }

    public void info() {
        System.out.println("Это автомобиль!!!");
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
