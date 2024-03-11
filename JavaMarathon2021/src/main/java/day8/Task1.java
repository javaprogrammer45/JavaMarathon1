package day8;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String str = new String();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            String s = str.concat(String.valueOf(i));
            //System.out.print(s + " ");
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы 1, в мс.: " + (stopTime1 - startTime1));


        StringBuilder stringBuilder = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Integer n = i;
            StringBuilder stringBuilder1 = stringBuilder.append(n);
            //System.out.print(stringBuilder1 + " ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы 2, в мс.: " + (stopTime2 - startTime2));
    }
}
