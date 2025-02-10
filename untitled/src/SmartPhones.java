public class SmartPhones extends Item{
    String display;

    public SmartPhones(String display) {
        this.display = display;
    }

    public SmartPhones(String name, String article, int price, String display) {
        super(name, article, price);
        this.display = display;
    }
}
