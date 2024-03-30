package day16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathToFile1 = separator + "C:" + separator + "JavaMarathon" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "file1.txt";
        String pathToFile2 = separator + "C:" + separator + "JavaMarathon" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "file2.txt";

        File file1 = new File(pathToFile1);
        File file2 = new File(pathToFile2);

        try (PrintWriter printWrite1 = new PrintWriter(file1)) {
            for (int i = 0; i < 1000; i++) {
                printWrite1.write(getRandomNumber(0, 100) + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWrite2 = new PrintWriter(file2)) {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String k = scanner.nextLine();
                String[] s = k.split(" ");

                int counter = 0;
                double sum = 0;
                for (int i = 0; i < s.length; i++) {

                    sum += parseInt(s[i]);
                    counter++;
                    if (counter == 20) {
                        double result = sum / counter;
                        printWrite2.print(result + " ");
                        counter = 0;
                        sum = 0;
                    }
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printResult(file2);
    }

    public static int getRandomNumber(int a, int b) {

        return a + (int) ((1 + b - a) * Math.random());
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;

            while (scanner.hasNextLine()) {
                String d = scanner.nextLine();
                String[] strings = d.split(" ");
                for (int i = 0; i < strings.length; i++) {
                    sum += Double.parseDouble(strings[i]);
                }
            }
            System.out.println((int) sum);
        } catch (IOException e) {
        }
    }
}
