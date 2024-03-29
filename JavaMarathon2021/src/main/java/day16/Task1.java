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


                for (int i = 0; i < result.length; i++) {
                    int a = Integer.parseInt(result[i]);
                    int[] arrA= new int[result.length];
                    arrA[i]=a;
                    System.out.println(arrA[i]);
                }

            }
scanner.close();
        }
        catch (IOException e){
            System.out.println("File not found!!!");
        }
    }
}

