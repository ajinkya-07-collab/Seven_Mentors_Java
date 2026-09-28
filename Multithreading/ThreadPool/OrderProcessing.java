package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessing {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int orderID = 111; orderID <= 130; orderID++) {
            int id = orderID;

            executor.submit(() -> {

                System.out.println("Processing Order " + id + " by " + Thread.currentThread().getName());
            });

            try {
                Thread.sleep(2000); // for every reqire 2sec to complete process
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }

            System.out.println("Order " + id + " Completed");
        }

        executor.shutdown();

    }

}
