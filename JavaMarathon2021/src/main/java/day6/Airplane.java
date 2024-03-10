package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private float length;
    private float weight;
    private int fuel;


    Airplane(String manufacturer, int year, float length, float weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        int fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public float getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + "," + "год выпуска: " + year + "," + "длина: " + length + "," + "вес: " + weight + "," + "количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }
}
