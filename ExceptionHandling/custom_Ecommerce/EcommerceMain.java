package ExceptionHandling.custom_Ecommerce;

import ExceptionHandling.custom_Ecommerce.exception.*;
import ExceptionHandling.custom_Ecommerce.model.Product;
import ExceptionHandling.custom_Ecommerce.service.EcommerceService;

public class EcommerceMain {

    public static void main(String[] args) {

        EcommerceService service = new EcommerceService();

        // 1. View Products
        service.viewProducts();

        Product product = null;

        try {

            product = service.findProduct(101);

            System.out.println("Product Found Successfully !!!");
            product.displayProduct();

            int quantity = 5;

            service.validateQuantity(quantity);

            System.out.println(
                    "Required Quantity : " + quantity
                            + "\nQuantity is Valid !!!");

            service.checkStock(product, quantity);

            System.out.println("Stock Available !!!");

            double total = service.calculateTotal(product, quantity);

            System.out.println("Total Amount : Rs." + total);

        } catch (ProductNotFoundException e) {

            System.out.println("Product Error : " + e.getMessage());

        } catch (InvalidQuantityException e) {

            System.out.println("Quantity Error : " + e.getMessage());

        } catch (OutOfStockException e) {

            System.out.println("Stock Error : " + e.getMessage());
        }
    }
}