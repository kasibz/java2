package shared;

public class Invoice {
    public String name;
    public String address;
    public String city;
    public String state;
    public int zipCode;

    public Invoice(String name, String address, String city, String state, int zipCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        String label = String.format("Ship to:\n  %s\n  %s\n  %s, %s %d\n\n", name, address, city, state, zipCode);

        return label;
    }
}