public class Appliances extends Item{
    int powerConsumption;

    public Appliances(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Appliances(String name, String article, int price, int powerConsumption) {
        super(name, article, price);
        this.powerConsumption = powerConsumption;
    }

}
