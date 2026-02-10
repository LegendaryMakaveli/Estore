package src;

public class ShoppingCart extends Customer {
    String items;
    public ShoppingCart(String name, String password, String email, int phone, int age, String address, String items) {
        super(name, password, email, phone, age, address);
        this.items = items;
    }

}