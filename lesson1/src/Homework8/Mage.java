package Homework8;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }
    @Override
    public int damage() {
        return 16;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага");
        enemy.takeDamage(damage());


    }

    }



