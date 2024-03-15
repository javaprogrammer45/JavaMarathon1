package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    private int magicAtt;



    Warrior(int healthMax, int healthMin, int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(healthMax, healthMin);
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt =magicAtt;
    }

    public void  physicalAttack(Hero hero) {
        health = getHealfMax() - (physAtt - physAtt*physDef);
        System.out.println(hero.toString());
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
