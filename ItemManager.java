package inventory;
import java.util.ArrayList;
import java.util.List;
public class ItemManager {
    private List<Item> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
