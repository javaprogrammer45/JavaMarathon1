package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("Ошибка ввода");
        } else if (quantity <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (quantity >= 5 &&
        quantity <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");


        }
    }
}
