package day16;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14Task1.txt");

        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String d = scanner.nextLine();
                String[] result = d.split(" ");

                float sum = 0;
                float res = 0;
                int[] arrA = new int[result.length];
                for (int i = 0; i < result.length; i++) {
                    int a = Integer.parseInt(result[i]);
                    arrA[i] = a;
                    sum += arrA[i];
                    res = sum / result.length;

                }
                System.out.printf("%f", res);
                System.out.print("     -->");
                System.out.printf("%10.3f", res);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("File not found!!!");
        }
    }
}

