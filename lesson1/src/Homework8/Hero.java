package Homework8;

 public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);

    public int damage() {
        return 0;
    }
}






