package Collections.Queue_eg.Deque.OrderManagement;

public class OrderModel {

    private int orderId;
    private String customerName;
    private String productName;
    private String status;

    public OrderModel(int orderId, String customerName,
            String productName, String status) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
                ", Customer: " + customerName +
                ", Product: " + productName +
                ", Status: " + status;
    }
}