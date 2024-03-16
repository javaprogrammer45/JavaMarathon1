package day11.task2;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    int health;
    double physDef;

    double magicDef;
    int physAtt;


    public Hero() {
        health = 100;
    }


    public void physicalAttack(Hero h) {
        double resultAtt = physAtt * (1 - h.physDef);
        if (h.health - resultAtt < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= resultAtt;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
