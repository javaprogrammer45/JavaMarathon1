package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i <= 4) {
            double dividend = scanner.nextDouble();
            double divider = scanner.nextDouble();
            i++;
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divider);
        }


    }


}

