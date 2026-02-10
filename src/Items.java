package src;

public class Items extends ShoppingCart {
    String choice;
    String products;


    public Items(String name, String password, String email, int phone, int age, String address, String items, String choice, String products) {
        super(name, password, email, phone, age, address, items);

        this.choice = choice;
        this.products = products;
    }
}
