package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 90;
        int max = 100;
        int diff = max - min;

        Player player1 = new Player(random.nextInt(diff + 1) + 90);
        Player player2 = new Player(random.nextInt(diff + 1) + 90);
        Player player3 = new Player(random.nextInt(diff + 1) + 90);
        Player player4 = new Player(random.nextInt(diff + 1) + 90);
        Player player5 = new Player(random.nextInt(diff + 1) + 90);
        Player player6 = new Player(random.nextInt(diff + 1) + 90);

        for (int i = 0; i < 100; i++) {
            player5.run();
        }
    }
}

