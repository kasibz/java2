package shared;

public class Item {
    public float price;
    public int quantity;
    public String name;
    public float itemTotal;

    public Item(float price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.itemTotal = quantity * price;
    }


}