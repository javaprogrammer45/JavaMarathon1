package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbersFill(0, 30, numbers);
        numbersFill(300, 350, numbers);
        System.out.println(numbers);
    }

    public static void numbersFill(int l, int k, List<Integer> list) {
        for (int i = l; i <= k; i++) {
            list.add((Integer) i);
        }

    }
}
