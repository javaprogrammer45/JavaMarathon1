package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                sum += array[i][j];
                System.out.print(array[i][j] + "   ");
            }
            System.out.print("//" + "Amount =  " + sum);
            System.out.println();
        }

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("MaxAmount =  " + maxSum);
        System.out.println("IndexString maxAmount = " + maxSumIndex);
    }
}

