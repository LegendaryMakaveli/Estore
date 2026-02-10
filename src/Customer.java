package src;

public class Customer extends User {
    String billingAddress;

    public Customer(String name, String password, String email, int phone, int age, String address) {
        super(name, password, email, phone, age, address);
        this.billingAddress = address;
    }

    public void setBillingAddress(String address){
        this.billingAddress = address;
    }
}
