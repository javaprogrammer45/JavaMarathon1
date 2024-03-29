package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathToFile = separator + "C:" + separator + "JavaMarathon" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" +
                separator + "resources" + separator + "shoes.csv";

        String separator1 = File.separator;
        String pathToFile1 = separator1 + "C:" + separator1 + "JavaMarathon" + separator1 + "JavaMarathon2021" + separator1 + "src" + separator1 + "main" +
                separator1 + "resources" + separator1 + "missing_shoes.txt";

        File file = new File(pathToFile);
        File file1 = new File(pathToFile1);

        try( PrintWriter printWriter = new PrintWriter(file1)) {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] lines = scanner.nextLine().split(";");
                if (Integer.parseInt(lines[2]) == 0) {
                    printWriter.println(lines[0] + "   " + lines[1] + "   " + "   " + lines[2]);
                    printWriter.close();
                }
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("File not found!!!");
        }
    }
}