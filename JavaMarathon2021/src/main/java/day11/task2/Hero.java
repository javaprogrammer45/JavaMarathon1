package day11.task2;

public abstract class Hero {
 private int healfMax;
 private int healfMin;

 Hero(int healfMax, int healfMin) {
     this.healfMax=healfMax;
     this.healfMin= healfMin;
     healfMax=100;
     healfMin =0;
 }

    public int getHealfMax() {
        return healfMax;
    }

    public int getHealfMin() {
        return healfMin;
    }
}
