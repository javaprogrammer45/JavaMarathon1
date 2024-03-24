package day14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathToFile = separator + "JavaMarathon" + separator + "people.txt";
        File file = new File(pathToFile);

        try {
            System.out.println(parseFileToObjList(file));
        } catch (IOException e) {
            System.out.println("File not found!!!");
        }
    }

    public static List<Person> parseFileToObjList(File file) throws IOException {
        List<Person> listFromFile = new ArrayList<>();
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
            Person person = new Person(l[0], t);
            listFromFile.add(person);
        }

        return listFromFile;
    }

}

