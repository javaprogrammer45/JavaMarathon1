package day11.task2;

import day11.task2.interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        magicDef = 0.8;
        physDef = 0;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
