package Homework8;

public class Warrior extends Hero  {
    public Warrior (String name) {
        super(name);
    }
    @Override
    public int damage() {
        return 20;
    }
    @Override
    public void attackEnemy(Enemy enemy) {

        System.out.println(getName() + " атакует врага");
        enemy.takeDamage(damage());

    }

    }

