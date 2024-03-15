package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    private int magicAtt;



    Magician(int healthMax, int healthMin, int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(healthMax, healthMin);
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt =magicAtt;
    }


   public void magicalAttack(Hero hero){};

    public void  physicalAttack(Hero hero){};


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
