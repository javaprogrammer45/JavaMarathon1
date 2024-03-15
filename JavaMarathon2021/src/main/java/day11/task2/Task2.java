package day11.task2;

public class Task2 {
    public static void main(String[] args) {
Warrior warrior = new Warrior(100,0, 100, 80, 0, 30, 0);
Paladin paladin = new Paladin(100,0, 100, 50, 20, 15, 0);
Magician magician= new Magician(100, 0, 100,0, 80, 5, 20);
Shaman shaman = new Shaman(100, 0, 100, 20, 20, 10, 15);

        warrior.physicalAttack(paladin);
    }
}
