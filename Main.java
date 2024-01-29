import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product product1 = new Product("Смартфон", 50000.00, 4);
        Product product2 = new Product("Ноутбук", 75000.00, 5);

        // Создание категории Электроника и добавление продуктов в нее
        ArrayList<Product> electronicsProducts = new ArrayList<>();
        electronicsProducts.add(product1);
        electronicsProducts.add(product2);
        Category electronicsCategory = new Category("Электроника", electronicsProducts);

        // Отображение продуктов категории Электроника
        electronicsCategory.displayProducts();

        // Создание корзины для пользователя и добавление продукта в нее
        Basket user1Basket = new Basket();
        User user1 = new User("user1", "password1", user1Basket);
        user1Basket.addProduct(product1);

        // Удаление продукта из категории после покупки
        electronicsCategory.products.remove(product1);

        // Создание корзины для пользователя 2 и добавление продукта в нее
        Basket user2Basket = new Basket();
        User user2 = new User("user2", "password2", user2Basket);
        user2Basket.addProduct(product2);
        electronicsCategory.products.remove(product2); // Удаление продукта из категории после покупки

        // Отображение купленных продуктов пользователя
        user1.basket.displayPurchasedProducts();
        user2.basket.displayPurchasedProducts();

        // Отображение продуктов категории Электроника
        electronicsCategory.displayProducts();
    }
}
