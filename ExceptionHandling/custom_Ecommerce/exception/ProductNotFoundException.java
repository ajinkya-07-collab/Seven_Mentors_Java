package ExceptionHandling.custom_Ecommerce.exception;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(String message) {
        super(message);
    }

}
