package combat;
import entities.Enemy;
public interface Combat {
    void attack(Enemy enemy);
    void takeDamage(int damage);
}
