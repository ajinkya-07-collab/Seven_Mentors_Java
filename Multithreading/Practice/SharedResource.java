package Multithreading.Practice;

public class SharedResource {

    synchronized void checkout() {

        System.out.println(Thread.currentThread().getName() + " : CheckOut Started");

        System.out.println("----------------------------");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " - Order placed");
        System.out.println(Thread.currentThread().getName() + " - Payment completed");
        System.out.println(Thread.currentThread().getName() + " - Invoice generated");
        System.out.println(Thread.currentThread().getName() + " - Notification prepared");
        System.out.println(Thread.currentThread().getName() + " - Notification sent");

        System.out.println("----------------------------");

        System.out.println(Thread.currentThread().getName() + " - Checkout completed");

        System.out.println("----------------------------");
    }

}
