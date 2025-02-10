package combat;
import entities.Player;
import entities.Enemy;
public class CombatSystem {
    public void fight(Player player, Enemy enemy) {
        System.out.println("Combat starts between " + player.getName() + " and " + enemy.getName());
        player.attack(enemy);

        if (enemy.getHealth() > 0) {
            enemy.attack(player);
        } else {
            System.out.println(enemy.getName() + " is defeated!");
        }
    }
}
