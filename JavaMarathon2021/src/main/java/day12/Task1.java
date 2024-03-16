package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String a = "Audi";
        String b = "BMW";
        String c = "Mercedes";
        String d = "Mitsubishi";
        String f = "WV";
        String n = "Renault";

        List<String> cars = new ArrayList<>();

        cars.add(a);
        cars.add(b);
        cars.add(c);
        cars.add(d);
        cars.add(f);


        cars.add(cars.size() / 2, n);
        cars.remove(0);
        System.out.println(cars);
    }

}
