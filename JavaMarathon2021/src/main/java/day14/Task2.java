package day14;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathToFile = separator + "JavaMarathon" + separator + "people.txt";
        File file = new File(pathToFile);

        try {
            System.out.println(parseFileToStringList(file));
        } catch (IOException e) {
            System.out.println("File not found!!!");
        }
    }


    public static List<String> parseFileToStringList(File file) throws IOException {
        List<String> listFromFile = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        String string = scanner.nextLine();
        String[] strings = string.split(",");

        for (String m : strings) {
            String[] l = m.split(" ");
            int t = Integer.parseInt(l[1]);
            try {
                if (t <= 0) {
                    throw new IOException();
                }
            } catch (IOException e) {
                System.out.println("Invalid input fie!!!");
                return listFromFile = null;
            }
        }

        for (String s : strings) {
            listFromFile.add(s);
        }
        return listFromFile;
    }
}
