package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers >= 6) {
            countPlayers = 6;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina--;
        switch (stamina) {
            case 0: {
                countPlayers = countPlayers - 1;
                System.out.println(countPlayers);
                info();
                break;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int x = 6 - countPlayers;
            switch (x) {
                case 1: {
                    System.out.println("Команды не полные. На поле ещё есть " + x + " свободное место");
                    break;
                }
                case 2:
                case 3:
                case 4:
                case 5: {
                    System.out.println("Команды не полные. На поле ещё есть " + x + " свободных мест");
                    break;
                }
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }
}


