import java.util.ArrayList;
class Category {
    String name;
    ArrayList<Product> products;

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void displayProducts() {
        System.out.println("Все продукты магазина в категории: " + name);
        for (Product product : products) {
            System.out.println(product.name + " - " + product.price + " р. - Рейтинг: " + product.rating);
        }
    }
}