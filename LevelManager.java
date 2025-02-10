package level;

public class LevelManager {
    private int level;

    public LevelManager() {
        this.level = 1;
    }

    public void levelUp() {
        level++;
        System.out.println("Level up! New level: " + level);
    }
}
