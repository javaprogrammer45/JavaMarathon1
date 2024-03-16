package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    final int HEAL_HIMSELF = 50;
    final int HEAL_TEAMMATE = 30;
    int magicAtt = 15;


    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero h) {
        if (health + HEAL_TEAMMATE > MAX_HEALTH) {
            h.health = MAX_HEALTH;
        } else {
            h.health += HEAL_TEAMMATE;
        }


    }


    @Override
    public void magicalAttack(Hero h) {
        double resultAtt = magicAtt * (1 - h.magicDef);
        if (h.health - resultAtt < 0) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= resultAtt;
        }


    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
