package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Blu");
        car.setYearOfManufacture(2024);
        System.out.println("Марка автомобиля " + car.getModel());
        System.out.println("Цвет автомобиля: " + car.getColor());
        System.out.println("Год выпуска автомобиля: " + car.getYearOfManufacture());
    }
}

class Car {
    private String model;
    private String color;
    private int yearOfManufacture;

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
}