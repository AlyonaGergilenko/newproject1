package Homework8;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(200);
        Warrior warrior = new Warrior("Warrior");
        warrior.attackEnemy(enemy);
        Archer archer = new Archer("Archer");
        archer.attackEnemy(enemy);
        Mage mage = new Mage("Мage");
        mage.attackEnemy(enemy);
        System.out.println(enemy.isAlive());


    }
}