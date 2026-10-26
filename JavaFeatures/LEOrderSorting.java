import java.util.ArrayList;
import java.util.List;

class CustomerOrder {
    // data member
    private int orderId;
    private String customerName;
    private double amount;

    public CustomerOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.salary = amount;
    }

    @Override
    public String toString() {
        return "CustomerOrder [orderId=" + orderId + ", customerName=" + customerName + ", amount=" + amount + "]";
    }

}

public class LEOrderSorting {

    public static void main(String[] args) {

        List<CustomerOrder> orders = new ArrayList<>();

        orders.add(new CustomerOrder(101, "Rahul", 2456.55));
        orders.add(new CustomerOrder(102, "Ratan", 2006.55));
        orders.add(new CustomerOrder(103, "Amit", 50000));
        orders.add(new CustomerOrder(104, "Sneha", 15344));

        // lamba expression
        orders.sort((o1, o2) -> Double.compare(o1.getAmount(), o2.getAmount()));

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Using forEach Loop : Orders sorted by highest value(Amount)");
        System.out.println("--------------------------------------------------------------------------------");

        for (CustomerOrder customerOrder : orders) {
            System.out.println(customerOrder);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Using forEach loop by lambda expression : Orders sorted by highest value(Amount)");
        System.out.println("--------------------------------------------------------------------------------");

        orders.forEach(order -> System.out.println(order));

    }

}
