package ExceptionHandling.custom_Ecommerce.service;

import ExceptionHandling.custom_Ecommerce.exception.*;

import ExceptionHandling.custom_Ecommerce.model.*;

public class EcommerceService {

    private Product[] products;
    private Order order;

    public EcommerceService() {

        products = new Product[3];

        products[0] = new Product(101, "Laptop", 50000, 5);
        products[1] = new Product(102, "Mobile", 20000, 10);
        products[2] = new Product(103, "Headphones", 2000, 0);
    }

    public void viewProducts() {

        for (Product product : products) {
            product.displayProduct();
            System.out.println();
        }
    }

    public Product findProduct(int productId)
            throws ProductNotFoundException {

        for (Product product : products) {

            if (product.getProductId() == productId) {
                return product;
            }
        }

        throw new ProductNotFoundException(
                "Product with ID " + productId + " not found");
    }

    public void validateQuantity(int quantity)
            throws InvalidQuantityException {

        if (quantity <= 0) {
            throw new InvalidQuantityException(
                    "Quantity must be greater than Zero");
        }
    }

    public void checkStock(Product product, int quantity)
            throws OutOfStockException {

        if (quantity > product.getStock()) {
            throw new OutOfStockException(
                    "Out of Stock. Available Stock is : "
                            + product.getStock());
        }
    }

    public double calculateTotal(Product product, int quantity) {

        return product.getPrice() * quantity;
    }
}