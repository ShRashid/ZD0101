import java.util.ArrayList;
class Basket {
    ArrayList<Product> purchasedProducts;

    public Basket() {
        purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void displayPurchasedProducts() {
        System.out.println("Приобретенные продукты:");
        for (Product product : purchasedProducts) {
            System.out.println(product.name + " - " + product.price + " р.");
        }
    }
}