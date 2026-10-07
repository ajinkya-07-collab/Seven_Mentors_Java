package Collections.Queue_eg.Deque.OrderManagement;

public class OrderMain {

    public static void main(String[] args) {

        OrderService service = new OrderService();

        service.addOrder(
                new OrderModel(101, "Rohit", "Laptop", "NORMAL"));

        service.addOrder(
                new OrderModel(102, "Tushar", "Mobile", "NORMAL"));

        service.addOrder(
                new OrderModel(103, "Sumit", "Headphones", "NORMAL"));

        service.addOrder(
                new OrderModel(104, "Rohan", "Keyboard", "NORMAL"));

        // Cancelled order gets priority
        service.cancelOrder(
                new OrderModel(105, "Pooja", "Mouse", "CANCELLED"));

        service.addOrder(
                new OrderModel(106, "Amit", "Monitor", "NORMAL"));

        service.showOrders();

        System.out.println("\n------- Processing Current Order -------");

        service.processNextOrder();
        service.processNextOrder();
        service.processNextOrder();

        service.showOrders();
    }
}