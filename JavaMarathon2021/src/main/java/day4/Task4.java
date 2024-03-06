package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxSum);
        System.out.println(maxSumInd);
    }
}