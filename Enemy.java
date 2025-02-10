package entities;

public abstract class Enemy {
    protected String name;
    protected int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack(Player player);

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage.");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
