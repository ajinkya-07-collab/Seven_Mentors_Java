package Collections.Queue_eg.Deque.OrderManagement;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrderService {

    private Deque<OrderModel> orders = new ArrayDeque<>();

    // Normal order → add at rear
    public void addOrder(OrderModel order) {

        orders.offerLast(order);

        System.out.println("Order Added : " + order);
    }

    // Cancelled order → add at front
    public void cancelOrder(OrderModel order) {

        orders.offerFirst(order);

        System.out.println("Cancelled Order Added at Front : " + order);
    }

    // Process next order
    public void processNextOrder() {

        if (orders.isEmpty()) {
            System.out.println("No Orders Waiting!");
            return;
        }

        System.out.println("Processing : " + orders.peekFirst());
        System.out.println("Completed : " + orders.pollFirst());
    }

    // Show all waiting orders
    public void showOrders() {

        System.out.println("\n------- Waiting Orders -------");

        for (OrderModel order : orders) {
            System.out.println(order);
        }
    }
}