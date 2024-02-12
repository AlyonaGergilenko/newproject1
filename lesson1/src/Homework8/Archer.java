package Homework8;

public class Archer extends Hero {
    public Archer (String name) {
        super(name);
    }

    @Override
    public int damage() {
        return 25;}

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага");
        enemy.takeDamage(damage());

    }

    }






