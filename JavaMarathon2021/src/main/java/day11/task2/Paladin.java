package day11.task2;

import day11.task2.interfaces.Healer;

public class Paladin extends Hero implements Healer {

    final int HEAL_HIMSELF = 25;
    final int HEAL_TEAMMATE = 10;


    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;

    }


    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > 100) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero h) {
        if (h.health + HEAL_TEAMMATE > 100) {
            h.health = MAX_HEALTH;
        } else {
            h.health += HEAL_TEAMMATE;
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

}

