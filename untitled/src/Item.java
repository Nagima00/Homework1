public class Item {
    String name;
    String article;
    int price;

    public Item() {

    }

    public Item(String name, String article, int price) {
        this.name = name;
        this.article = article;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
