package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added : " + product);
    }

    public Product findProduct(int productId) {
        return products.get(productId);
    }

    public void removeProduct(int productId) {
        Product removed = products.remove(productId);

        if (removed != null) {
            System.out.println("Removed : " + removed);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayProducts() {
        System.out.println("\nProduct Catalog : ");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
