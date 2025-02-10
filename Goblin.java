package entities;

public class Goblin extends Enemy{
    public Goblin() {
        super("Goblin", 30);
    }

    @Override
    public void attack(Player player) {
        player.takeDamage(5);
        System.out.println(name + " attacks " + player.getName());
    }
}
