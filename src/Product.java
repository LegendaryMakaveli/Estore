package src;

public class Product extends Items {
    String productId;
    double productPrice;
    String productCategory;
    public Product(String name, String password, String email, int phone, int age, String address, String items, String choice, String products, String ProductId,  double productPrice, String productCategory) {
        super(name, password, email, phone, age, address, items, choice, products);
        this.productId = productId;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }
}
