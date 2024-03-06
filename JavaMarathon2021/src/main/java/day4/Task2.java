package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int arr : array) {
            if (arr > max) {
                max = arr;
            }
        }
        System.out.println("max = " + max);

        int min = 10;
        for (int arr : array) {
            if (arr < min) {
                min = arr;
            }
        }
        System.out.println("min = " + min);

        int quantity = 0;
        for (int arr : array) {
            if (arr % 10 == 0) {
                quantity += 1;
            }
        }
        System.out.println("quantity(оканчивающихся на ноль) = " + quantity);

        int amount = 0;
        for (int arr : array) {
            if (arr % 10 == 0) {
                amount += arr;
            }
        }
        System.out.println("amount(оканчивающихся на ноль) = " + amount);
    }
}
