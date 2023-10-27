package shared;
import java.util.ArrayList;

// is this a compososition problem? Shopping cart has Items
// needs 10% sales tax added to all orders
// needs shipping charge in constructor
public class ShoppingCart {
    private ArrayList<Item> items;
    private float total;
    private float shippingCharge;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.total = 0;
        this.shippingCharge = 5.00F;
    }

    // contructor w/ shipping charge
    public ShoppingCart(float shippingCharge) {
        this.items = new ArrayList<>();
        this.total = 0;
        this.shippingCharge = shippingCharge;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void calculateTotal() {
        float sum = 0;
        for (Item item : this.items) {
            sum += item.itemTotal;
        }

        // tax
        float tax = 0.10f * sum;

        // check if shipping charge needed
        if (sum < 10.00) 
            sum += this.shippingCharge;

        sum += tax;
        this.total = sum;

        return;
    }

    public String getTotal() {
        return String.format("$%.2f", this.total);
    }

    public String shipOrder(String name, String address, String city, String state, int zipCode) {
        Invoice invoice = new Invoice(name, address, city, state, zipCode);
        String itemHead = String.format("Items\n-----\n");
        String itemStr = "";
        for (Item item : items) {
            itemStr += String.format("%-7s $%-5.2f (%d) $%-8.2f\n", item.name, item.price, item.quantity, item.itemTotal);
        }
        String shipping = "Shipping: Free";
        if (this.total > 10.00)
            shipping = String.format("Shipping: $%.2f\n", this.shippingCharge);
        String totalSnippet = String.format("Total Cost\n---------\n$%.2f", this.total);
        String result = String.format("%s%s%s\n%s\n%s", invoice, itemHead, itemStr, shipping, totalSnippet);
        return result;
    }
}