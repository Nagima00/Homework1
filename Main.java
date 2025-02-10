package game;
import entities.Player;
import entities.Goblin;
import inventory.Item;
import combat.CombatSystem;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        Goblin goblin = new Goblin();
        Item sword = new Item("Sword");

        player.addItem(sword);
        player.showInventory();

        CombatSystem combatSystem = new CombatSystem();
        combatSystem.fight(player, goblin);
    }
}
