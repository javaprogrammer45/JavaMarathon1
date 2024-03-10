package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("Длина массива:" + array.length);
        int quantity = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                quantity++;
            }
            if (array[i] == 1) {
                one++;
            }
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += array[i];
        }
        System.out.println("Количество чисел больше 8: " + quantity);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел : " + even);
        System.out.println("Количество нечетных чисел : " + odd);
        System.out.println("Сумма всех элементов массива : " + sum);



























































































































































































    }
}
