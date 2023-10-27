package shared;
import java.util.ArrayList;

// is this a compososition problem? Shopping cart has Items
// needs 10% sales tax added to all orders
// needs shipping charge in constructor
public class ShoppingCart {
    private ArrayList<Item> items;
    private float total;
    private float shippingCharge;

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
            sum += item.price * item.quantity;
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
}