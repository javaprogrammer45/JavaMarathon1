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

