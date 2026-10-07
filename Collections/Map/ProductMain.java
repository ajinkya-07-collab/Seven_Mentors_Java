package Collections.Map;

public class ProductMain {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product(101, "Mobile", 25000));
        catalog.addProduct(new Product(102, "Tablet", 35000));
        catalog.addProduct(new Product(103, "Laptop", 85000));
        catalog.addProduct(new Product(104, "Mouse", 500));
        catalog.addProduct(new Product(105, "Keyboard", 800));

        catalog.displayProducts();

        System.out.println("\nSearching Product 105 : ");
        Product product = catalog.findProduct(105);
        System.out.println(product);

        System.out.println("\nRemoving Product 102 : ");
        catalog.removeProduct(102);
        catalog.displayProducts();
    }
}
