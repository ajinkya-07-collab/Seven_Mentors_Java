package ExceptionHandling.custom_Ecommerce.model;

public class Order {

    private int orderId;
    private Product product;
    private int quantity;
    private double totalAmount;

    public Order(int orderId, Product product, int quantity, double totalAmount) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
