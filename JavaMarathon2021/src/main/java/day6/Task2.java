package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Germany", 2023, 35.2f, 180.5f);
        airplane.setYear(2024);
        airplane.setLength(33.1f);
        airplane.fillUp(100);
        airplane.info();
        airplane.setYear(2020);
        airplane.setLength(30.7f);
        airplane.fillUp(300);
        airplane.info();
    }
}
