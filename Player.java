package entities;
import inventory.Inventory;
import inventory.Item;
import combat.Combat;
import java.util.ArrayList;
import java.util.List;

public class Player implements Inventory,Combat {
    private String name;
    private int health;
    private int experience;
    private List<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }




    @Override
    public void addItem(Item item) {
        inventory.add(item);
        System.out.println(name + " picked up: " + item.getName());
    }

    @Override
    public void removeItem(Item item) {
        inventory.remove(item);
        System.out.println(name + " dropped: " + item.getName());
    }

    @Override
    public void showInventory() {
        System.out.println(name + "'s Inventory:");
        for (Item item : inventory) {
            System.out.println("- " + item.getName());
        }
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println(name + " attacks " + enemy.getName());
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage.");
    }

    public void gainExperience(int exp) {
        experience += exp;
        System.out.println(name + " gained " + exp + " XP.");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
