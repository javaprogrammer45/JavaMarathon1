package day6;

public class Airplane {
    private String manufacturer;
    int year;
    float length;
    float weight;
    int fuel;


    Airplane(String manufacturer, int year, float length, float weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
        info();
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

    public int fillUp(int n) {

        fuel = fuel + n;
        return fuel;
    }
}
