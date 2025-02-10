package inventory;
import inventory.Item;

public interface Inventory {
    void addItem(Item item);
    void removeItem(Item item);
    void showInventory();
}
