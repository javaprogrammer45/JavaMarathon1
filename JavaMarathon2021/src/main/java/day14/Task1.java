package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathToFile = separator + "JavaMarathon" + separator + "day14Task1.txt";

        File file = new File(pathToFile);
        Task1.printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.nextLine();
            String[] arrStr = string.split(" ");

            if (arrStr.length < 10 || arrStr.length > 10) {
                throw new IOException();
            }

            int[] numbersFromFile = new int[10];
            int count = 0;
            int sum = 0;
            for (String s : arrStr) {
                numbersFromFile[count++] = Integer.parseInt(s);
            }
            int count1 = 0;
            for (int l : numbersFromFile) {
                sum += numbersFromFile[count1++];
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } catch (IOException e) {
            System.out.println("Invalid input file!!!");
        }
    }

}

